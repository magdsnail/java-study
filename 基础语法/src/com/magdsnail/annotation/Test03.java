package com.magdsnail.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

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
}

@Target({ElementType.TYPE, ElementType.METHOD})
@interface MyAnnotation2{
    //String
    String name();

}
