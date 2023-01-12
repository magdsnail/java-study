package com.magdsnail.exception.demo03;

import com.magdsnail.exception.demo01.MyException;

public class Test4 {
    static void test(int a) throws MyException {
        System.out.println("传递参数为" + a);
    }

    public static void main(String[] args) {
        try {
            test(1);
        } catch (MyException e) {
            System.out.println("myexception" + e);
        }
    }
}
