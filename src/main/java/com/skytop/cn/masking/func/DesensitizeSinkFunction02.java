package com.skytop.cn.masking.func;

import com.alibaba.druid.pool.DruidDataSource;
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
import java.text.SimpleDateFormat;
import java.util.Set;

/**
 * @author Blue红红
 * @description 功能描述
 * @create 2022/8/22 1:23
 */
public class DesensitizeSinkFunction02 extends RichSinkFunction<Tuple2<Object, JSONObject>> {

    private PreparedStatement preparedStatement;
    private Connection connection;
    private DruidDataSource dataSource;
    
    Long count = 0L;

    @Override
    public void open(Configuration parameters) throws Exception {
        dataSource = DruidDSUtil.createDataSource();
        connection = dataSource.getConnection();
        connection.setAutoCommit(false);
    }

    @Override
    public void invoke(Tuple2<Object, JSONObject> value, Context context) throws Exception {
        Object o = value.f0;
        JSONObject jsonObject = value.f1;
        String table = jsonObject.getString("table");
        StringBuilder builder = new StringBuilder();
        builder.append("insert into ")
                .append("wangzhihong")
                .append(".")
                .append("a_" + table)
                .append(" ");
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
        JSONObject jsonData = jsonObject.getJSONObject("after");
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
        preparedStatement.addBatch();
        preparedStatement.executeBatch();

    }

    @Override
    public void close() throws Exception {
        if (connection != null) {
            connection.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }

    }
}
