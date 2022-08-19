package com.skytop.cn.masking.func;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.skytop.cn.masking.utils.DruidDSUtil;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Set;

/**
 * @author wzh18
 */
public class DesensitizeSinkFunction extends RichSinkFunction<JSONObject> {
    private PreparedStatement preparedStatement;
    private Connection connection;
    private DruidDataSource dataSource;

    @Override
    public void open(Configuration parameters) throws Exception {
        dataSource = DruidDSUtil.createDataSource();
        connection = dataSource.getConnection();
    }

    @Override
    public void invoke(JSONObject value, Context context) throws Exception {
        String table = value.getString("table");
        StringBuilder builder = new StringBuilder();
        builder.append("insert into ")
                .append("test_flink_mask")
                .append(".")
                .append(table)
                .append(" ");
        String className = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, table);
        Class<?> clazz = Class.forName("com.skytop.cn.masking.entity." + className);
        String after1 = value.getString("after");
        Object o = JSON.parseObject(after1, clazz);
        Field[] fields = o.getClass().getDeclaredFields();
        builder.append(" values (");
        for (int i = 0; i < fields.length; i++) {
            if (i < fields.length - 1) {
                builder.append("?,");
            } else {
                builder.append("?)");
            }
        }
        String sql = builder.toString();
        preparedStatement = connection.prepareStatement(sql);
        JSONObject jsonData = value.getJSONObject("after");
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            // Long => java.sql.Date
            if (fields[i].getType() == Date.class && fields[i].get(o) != null) {
                Set<String> keySet = jsonData.keySet();
                String dateName = null;
                for (String key : keySet) {
                    String camelKey = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, key);
                    if (fields[i].getName().equals(camelKey)) {
                        dateName = key;
                    }
                }
                if (jsonData.get(dateName).getClass() == Integer.class) {
                    Long second = (long) ((Integer) jsonData.get(dateName) * 24 * 60 * 60);
                    java.util.Date date = new java.util.Date();
                    date.setTime(second * 1000);
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    String format = simpleDateFormat.format(date);
                    Date date1 = Date.valueOf(format);
                    preparedStatement.setObject(i + 1, date1);
                    continue;
                }
            }
            preparedStatement.setObject(i + 1, fields[i].get(o));
        }
        preparedStatement.execute();
    }

    @Override
    public void close() throws Exception {
        connection.close();
    }
}
