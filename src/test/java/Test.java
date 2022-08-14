import com.alibaba.fastjson2.JSONObject;
import com.google.common.base.CaseFormat;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {


    @org.junit.Test
    public void test01() throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        Class<?> t = Class.forName("com.skytop.cn.masking.entity.Test");
        Field[] fields = t.getDeclaredFields();
        Object o = t.newInstance();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "wzh");
        for (Field field : fields) {
            field.setAccessible(true);
            String name = field.getName();
            System.out.println(name);
            field.set(o, jsonObject.getString("name"));
        }
        System.out.println(o);

    }
}
