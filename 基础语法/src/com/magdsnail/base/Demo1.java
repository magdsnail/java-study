package com.magdsnail.base;

public class Demo1 {
    public static void main(String[] args) {
        String hello = "wkj";
        String abc = "wangkejing";
        System.out.println(hello);
        String template = "%s--->%s";
        String format = String.format(template, hello, abc);
        System.out.println(format);
    }


}
