package com.skytop.cn.masking;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.skytop.cn.masking.func.DesensitizeSinkFunction;
import com.skytop.cn.masking.func.DesensitizeUdf;
import com.skytop.cn.masking.func.TableProcessFunction;
import com.ververica.cdc.connectors.mysql.source.MySqlSource;
import com.ververica.cdc.connectors.mysql.table.StartupOptions;
import com.ververica.cdc.connectors.shaded.org.apache.kafka.connect.json.DecimalFormat;
import com.ververica.cdc.connectors.shaded.org.apache.kafka.connect.json.JsonConverterConfig;
import com.ververica.cdc.debezium.JsonDebeziumDeserializationSchema;
import org.apache.flink.api.common.eventtime.WatermarkStrategy;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.state.MapStateDescriptor;
import org.apache.flink.streaming.api.datastream.BroadcastConnectedStream;
import org.apache.flink.streaming.api.datastream.BroadcastStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.co.BroadcastProcessFunction;
import org.apache.flink.util.Collector;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


/**
 * @author Blue红红
 * @description 功能描述
 * @create 2022/8/11 22:24
 */
public class TestOneTable {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(5);

        MySqlSource<String> configureTableSource = MySqlSource.<String>builder()
                .hostname("hadoop102")
                .port(3306)
                .databaseList("wangzhihong")
                .tableList("wangzhihong.configuration_table")
                .username("root")
                .password("root")
                .deserializer(new JsonDebeziumDeserializationSchema())
                .startupOptions(StartupOptions.initial())
                .build();
        DataStreamSource<String> ctDS = env.fromSource(configureTableSource, WatermarkStrategy.noWatermarks(), "configureTableSource");


        Map config = new HashMap();
        config.put(JsonConverterConfig.DECIMAL_FORMAT_CONFIG, DecimalFormat.NUMERIC.name());
        JsonDebeziumDeserializationSchema jdd = new JsonDebeziumDeserializationSchema(false,config);
        MySqlSource<String> mySqlSource = MySqlSource.<String>builder()
                .hostname("hadoop102")
                .port(3306)
                .databaseList("gmall_1227_flink")
                .tableList("gmall_1227_flink.*")
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


        MapStateDescriptor mapStateDescriptor = new MapStateDescriptor<>("desensitization_rule", String.class, String.class);
        BroadcastStream<String> broadcastDS = ctDS.broadcast(mapStateDescriptor);

        BroadcastConnectedStream<JSONObject, String> connectDS = jsonDS.connect(broadcastDS);

        SingleOutputStreamOperator<JSONObject> desensitizationJsonDS = connectDS.process(new TableProcessFunction(mapStateDescriptor));

        desensitizationJsonDS.addSink(new DesensitizeSinkFunction());

        env.execute("");
    }
}
