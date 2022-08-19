import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.ververica.cdc.connectors.mysql.source.MySqlSource;
import com.ververica.cdc.connectors.mysql.table.StartupOptions;
import com.ververica.cdc.connectors.shaded.org.apache.kafka.connect.json.DecimalFormat;
import com.ververica.cdc.connectors.shaded.org.apache.kafka.connect.json.JsonConverterConfig;
import com.ververica.cdc.debezium.JsonDebeziumDeserializationSchema;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    BigDecimal count;


    @org.junit.Test
    public void test01() throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(5);


        Map config = new HashMap();
        config.put(JsonConverterConfig.DECIMAL_FORMAT_CONFIG, DecimalFormat.NUMERIC.name());
        JsonDebeziumDeserializationSchema jdd = new JsonDebeziumDeserializationSchema(false,config);
        MySqlSource<String> mySqlSource = MySqlSource.<String>builder()
                .hostname("hadoop102")
                .port(3306)
                .databaseList("wangzhihong")
                .tableList("wangzhihong.ori_test2")
                .username("root")
                .password("root")
                .deserializer(jdd)
                .startupOptions(StartupOptions.initial())
                .build();
        DataStreamSource<String> dataStreamSource = env.fromSource(mySqlSource, WatermarkStrategy.noWatermarks(), "data");

        SingleOutputStreamOperator<JSONObject> jsonDS = dataStreamSource.map(new MapFunction<String, JSONObject>() {
            @Override
            public JSONObject map(String s) throws Exception {
                JSONObject jsonObject = JSON.parseObject(s);
                JSONObject jsonObject1 = new JSONObject();
                jsonObject1.put("after", jsonObject.getJSONObject("after"));
                jsonObject1.put("database", jsonObject.getJSONObject("source").getString("db"));
                jsonObject1.put("table", jsonObject.getJSONObject("source").getString("table"));
                return jsonObject1;
            }
        });


        SingleOutputStreamOperator<JSONObject> after = jsonDS.map(new MapFunction<JSONObject, JSONObject>() {
            @Override
            public JSONObject map(JSONObject jsonObject) throws Exception {
                JSONObject after = jsonObject.getJSONObject("after");
                String strAfter = jsonObject.getString("after");
                String table = jsonObject.getString("table");
                String className = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, table);
                Class<?> clazz = Class.forName("com.skytop.cn.masking.entity." + className);


                Object o1 = JSONObject.parseObject(strAfter, clazz);

                Field[] fields = o1.getClass().getDeclaredFields();
                for (int i = 0; i < fields.length; i++) {
                    fields[i].setAccessible(true);
                    if (fields[i].get(o1) != null) {
                        // mysql中Date类型  经过CDC 到jvm中会变成Integer
                        if (fields[i].getType() == Date.class) {
                            Set<String> keySet = after.keySet();
                            String dateName = null;
                            for (String key : keySet) {
                                String camelKey = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, key);
                                if (fields[i].getName().equals(camelKey)) {
                                    dateName = key;
                                }
                            }
                            if (after.get(dateName).getClass() == Integer.class) {
                                Long second = (long) ((Integer) after.get(dateName) * 24 * 60 * 60);
                                java.util.Date date = new java.util.Date();
                                date.setTime(second * 1000);
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                                String format = simpleDateFormat.format(date);
                                Date date1 = Date.valueOf(format);
                                fields[i].set(o1, date1);
                            }
                        }
                    }
                    System.out.println(fields[i].get(o1));
                }

                return jsonObject;
            }
        });

        after.print();

        env.execute();

    }
}
