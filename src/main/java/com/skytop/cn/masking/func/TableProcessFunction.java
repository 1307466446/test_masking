package com.skytop.cn.masking.func;

import com.alibaba.fastjson2.JSONObject;
import org.apache.flink.api.common.state.BroadcastState;
import org.apache.flink.api.common.state.MapStateDescriptor;
import org.apache.flink.api.common.state.ReadOnlyBroadcastState;
import org.apache.flink.streaming.api.functions.co.BroadcastProcessFunction;
import org.apache.flink.util.Collector;
import java.lang.reflect.Method;
import java.util.Set;

/**
 * @author wzh18
 */
public class TableProcessFunction extends BroadcastProcessFunction<JSONObject, String, JSONObject> {

    MapStateDescriptor<String, String> mapStateDescriptor;

    public TableProcessFunction(MapStateDescriptor<String, String> mapStateDescriptor) {
        this.mapStateDescriptor = mapStateDescriptor;
    }

    @Override
    public void processBroadcastElement(String s, BroadcastProcessFunction<JSONObject, String, JSONObject>.Context context, Collector<JSONObject> collector) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(s);
        JSONObject after = jsonObject.getJSONObject("after");
        BroadcastState<String, String> broadcastState = context.getBroadcastState(mapStateDescriptor);
        broadcastState.put(after.getString("db_table_column"), after.getString("desensitization_func"));
    }

    @Override
    public void processElement(JSONObject jsonObject, BroadcastProcessFunction<JSONObject, String, JSONObject>.ReadOnlyContext ctx, Collector<JSONObject> collector) throws Exception {
        ReadOnlyBroadcastState<String, String> broadcastState = ctx.getBroadcastState(mapStateDescriptor);
        String database = jsonObject.getString("database");
        String table = jsonObject.getString("table");
        JSONObject after = jsonObject.getJSONObject("after");
        Set<String> keySet = after.keySet();
        for (String column : keySet) {
            String path = database + "/" + table + "/" + column;
            String state_value = broadcastState.get(path);
            if (state_value != null) {
                String value = after.getString(column);
                Method method = DesensitizeUdf.class.getMethod(state_value, String.class);
                Object invoke = method.invoke(DesensitizeUdf.class, value);
                if (invoke != null) {
                    after.put(column, String.valueOf(invoke));
                }
            }
        }
        collector.collect(jsonObject);
    }


}
