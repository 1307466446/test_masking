package com.skytop.cn.masking.func;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.skytop.cn.masking.utils.DruidDSUtil;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.shaded.guava18.com.google.common.base.CaseFormat;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Set;

/**
 * @author Blue红红
 * @description 功能描述
 * @create 2022/8/22 1:23
 */
public class DesensitizeSinkFunction03 extends RichSinkFunction<List<JSONObject>> {


    private DruidDataSource dataSource;
    private PreparedStatement preparedStatement;
    private Connection connection;


    @Override
    public void open(Configuration parameters) throws Exception {
        dataSource = DruidDSUtil.createDataSource();
        connection = dataSource.getConnection();
        connection.setAutoCommit(false);
    }

    @Override
    public void invoke(List<JSONObject> jsonObjects, Context context) throws Exception {
        System.out.println("==========================" + jsonObjects.size());
        JSONObject jsonObject = jsonObjects.get(0);
        String table = jsonObject.getString("table");
        StringBuilder builder = new StringBuilder();
        builder.append("insert into ")
                .append("test_flink_mask")
                .append(".").append(table)
                .append(" ")
                .append("values (");
        JSONObject after = jsonObject.getJSONObject("after");
        String className = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, table);
        Class<?> clazz = Class.forName("com.skytop.cn.masking.entity." + className);
        Set<String> keySet = after.keySet();
        for (int i = 0; i < keySet.size(); i++) {
            if (i < keySet.size() - 1) {
                builder.append("?,");
            } else {
                builder.append("?)");
            }
        }
        String sql = builder.toString();
        preparedStatement = connection.prepareStatement(sql);
        for (JSONObject value : jsonObjects) {
            Object o = JSON.parseObject(value.getString("after"), clazz);
            Field[] fields = o.getClass().getDeclaredFields();
            for (int i = 0; i < fields.length; i++) {
                fields[i].setAccessible(true);
                // Integer => java.sql.Date 日期类型的处理
                if (fields[i].get(o) != null && fields[i].getType() == Date.class) {
                    String dateName = null;
                    String camelKey;
                    // 如果mysql的date类型字段是带有下划线的我们就转换，没有则不转换，为了与实体类相对应上
                    for (String key : keySet) {
                        if (key.contains("_")) {
                            camelKey = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, key);
                        } else {
                            camelKey = key;
                        }
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
                        preparedStatement.setObject(i + 1, date1);
                        continue;
                    }
                }
                preparedStatement.setObject(i + 1, fields[i].get(o));
            }
            preparedStatement.addBatch();
        }
        try {
            int[] batch = preparedStatement.executeBatch();
            System.out.println("执行了sql: " + batch.length);
            connection.commit();
        } catch (SQLException e) {
            System.out.println(e+"\n"+sql);
        }


    }

    @Override
    public void close() throws Exception {

    }
}
