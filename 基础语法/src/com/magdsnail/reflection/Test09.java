package com.magdsnail.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: Test09
 * Package: com.magdsnail.reflection
 * Description:
 *
 * @Date: 2023-03-13 013 16:53
 * @Author: wangkejing
 */

//动态创建对象 通过反射
public class Test09 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c1 = Class.forName("com.magdsnail.reflection.User");

        //构造一个对象
        User user = (User) c1.newInstance();//本质是调佣了无参构造器
        System.out.println(user);


        //通过构造器创建对象
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        User user2 = (User) declaredConstructor.newInstance("wangkejing", 001, 18);
        System.out.println(user2);


        //通过反射调用普通方法
        User user3 = (User) c1.newInstance();//本质是调佣了无参构造器
        //通过反射获取一个方法
        Method setName = c1.getDeclaredMethod("setName", String.class);
        //invoke 激活
        //(对象 “方法的值”)
        setName.invoke(user3, "wangkejing");
        System.out.println(user3.getName());


        //通过反射操作属性
        User user4 = (User)c1.newInstance();
        Field name = c1.getDeclaredField("name");


        //不能直接操作私有属性 我们需要关闭程序的安全检测 属性或者方法的setAccessible(true)
        name.setAccessible(true);
        name.set(user4, "狂神2");
        System.out.println(user4.getName());


    }
}
