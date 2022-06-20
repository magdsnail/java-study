package com.magdsnail.oop.demo07;

import static java.lang.Math.random;


public class Person {

    static {
        System.out.println("代码块");
    }

    public static void main(String[] args) {
        System.out.println(random());
    }

}
