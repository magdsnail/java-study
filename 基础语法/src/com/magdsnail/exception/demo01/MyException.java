package com.magdsnail.exception.demo01;

public class MyException extends Exception {

    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    
}
