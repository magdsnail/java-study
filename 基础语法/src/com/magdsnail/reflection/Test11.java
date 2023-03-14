package com.magdsnail.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * ClassName: Test11
 * Package: com.magdsnail.reflection
 * Description:通过反射获取泛型
 *
 * @Date: 2023-03-13 013 17:59
 * @Author: wangkejing
 */
public class Test11 {

    public void test01(Map<String, User> map, List<User> list) {
        System.out.println("test01");
    }

    public Map<String,User> test02() {
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = Test11.class.getMethod("test01", Map.class, List.class);


        Type[] genericParameterTypes = method.getGenericParameterTypes();
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("#"+genericParameterType);
            if(genericParameterType instanceof ParameterizedType) {
                for (Type actualTypeArgument : ((ParameterizedType) genericParameterType).getActualTypeArguments()) {
                    
                }

            }
        }
    }


}
