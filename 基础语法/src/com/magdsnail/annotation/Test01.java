package com.magdsnail.annotation;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: Test01
 * Package: com.magdsnail.annotation
 * Description:
 *
 * @Date: 2023-03-11 011 09:35
 * @Author: wangkejing
 */

//什么是注解
public class Test01 extends Object{

    //@Override//重写的注解
    @Override
    public String toString() {
        return super.toString();
    }

    //@Deprecated 不推荐使用  但是可以使用 或者存在更好的方式
    @Deprecated
    public void test() {
        System.out.println("deprecated");
        System.out.println(System.getProperty("java.class.path"));
    }

    @SuppressWarnings("all")
    public void test02() {
        List list = new ArrayList();
        System.out.println("SuppressWarnings");
    }








}
