package com.skytop.cn.masking.func;

import com.alibaba.fastjson2.JSONObject;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.sink.RichSinkFunction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * @author wzh18
 */
public class DesensitizeSinkFunction extends RichSinkFunction<JSONObject> {
    private PreparedStatement pst;
    private Connection conn;

    @Override
    public void open(Configuration parameters) throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://hadoop102:3306/test_flink_mask?useSSL=false", "root", "root");
        pst = conn.prepareStatement("insert into ");
    }

    @Override
    public void invoke(JSONObject value, Context context) throws Exception {

    }

    @Override
    public void close() throws Exception {

    }
}
