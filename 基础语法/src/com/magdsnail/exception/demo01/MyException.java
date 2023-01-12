package com.magdsnail.exception.demo01;

public class MyException extends Exception {

    //传递参数>10
    private int detail;

    public MyException(int a) {
        this.detail = a;
    }

    @Override
    public String toString() {
        return "myException{" + detail + "}";
    }
}