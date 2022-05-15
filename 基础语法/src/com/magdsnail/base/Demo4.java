package com.magdsnail.base;

public class Demo4 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte) i;
        double c = i;

        //强制转换 (类型)变量名 高--低
        //自动转换 低--高

        System.out.println(i);
        System.out.println(b);
        System.out.println(c);

        /**
         注意点：
         1.不能对布尔值进行转换
         2.不能把对象类型转为不相干的类型
         3.在把高容量转到低容量的时候，强制转换
         4.转换的时候可能存在内存溢出，或者精度问题
         *
         */

        System.out.println("++++++=================");
        System.out.println((int)23.7);
        System.out.println((int)-45.89f);

        System.out.println("======================");
        char e = 'a';
        int d = e + 1;
        System.out.println(d);
        System.out.println((char)d);

//        unicode 编码  内存等注意
    }
}
