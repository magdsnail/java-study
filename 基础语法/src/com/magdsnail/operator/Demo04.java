package com.magdsnail.operator;

public class Demo04 {
    public static void main(String[] args) {
        //++ -- 自增 自减 一元运算符
        int a = 3;

        int b = a++;

        System.out.println(a);

        int c = ++a;

        System.out.println(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c);

        //幂运算 2^3 2*2*2 = 9
        double pow = Math.pow(2, 3);
        System.out.println(pow);

    }
}
