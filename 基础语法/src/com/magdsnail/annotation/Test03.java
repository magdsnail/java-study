package com.magdsnail.annotation;

import java.lang.annotation.*;

/**
 * ClassName: Test03
 * Package: com.magdsnail.annotation
 * Description:
 *
 * @Date: 2023-03-11 011 10:48
 * @Author: wangkejing
 */
//自定义注解
public class Test03 {

    //注解可显示赋值 如果没有默认值 我们就必须给注解赋值
    @MyAnnotation2(age = 18)
    public void test(){

    }

    @MyAnnotation3("wangkejing")
    public void test3() {

    }


}

@Target({ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotation2{
    //注解的参数： 参数类型 + 参数名 + ()
    String name() default "";
    int age();
    int id() default -1;//如果默认值为-1 代表不存在

    String[] schools() default {"西部开源", "清华大学"};
}


@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation3{
  String value();
}
