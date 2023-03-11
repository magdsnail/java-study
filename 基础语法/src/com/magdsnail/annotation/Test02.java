package com.magdsnail.annotation;

import java.lang.annotation.*;

/**
 * ClassName: Test02
 * Package: com.magdsnail.annotation
 * Description:
 *
 * @Date: 2023-03-11 011 10:15
 * @Author: wangkejing
 */

//测试元注解
public class Test02 {
    @MyAnnotation
    public void test() {
        System.out.println("hahahahaha");
    }

}


//定义一个注解
//target 表示我们的注解可以用在哪些地方
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//Retention 表示我们的注解在什么地方还有效
//runtime > class > sources
@Retention(value = RetentionPolicy.RUNTIME)
//documented表示是否将我们的注解生成在javadoc中
@Documented
//inherited 子类可以继承父类的注解
@Inherited
@interface  MyAnnotation{

}