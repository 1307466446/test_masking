package com.skytop.cn.masking.func;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.skytop.cn.masking.entity.ConfigurationTable;
import org.apache.commons.lang3.StringUtils;
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
        String after = jsonObject.getString("after");
        ConfigurationTable configurationTable = JSON.parseObject(after, ConfigurationTable.class);
        BroadcastState<String, String> broadcastState = context.getBroadcastState(mapStateDescriptor);
        broadcastState.put(configurationTable.getDbTableColumn(), configurationTable.getDesensitizationFunc());
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
            // stateValue对应的脱敏方法名
            String stateValue = broadcastState.get(path);
            String value = after.getString(column);
            if (stateValue != null && StringUtils.isNotEmpty(value)) {
                Method method = DesensitizeUdf.class.getMethod(stateValue, String.class);
                Object invoke = method.invoke(DesensitizeUdf.class, value);
                if (invoke != null) {
                    after.put(column, String.valueOf(invoke));
                    continue;
                }
            }
        }
        collector.collect(jsonObject);
    }


}
