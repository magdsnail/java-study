package com.magdsnail.thread02;

import java.util.concurrent.Callable;


//线程创建方式三： 实现callable接口
/**
 * callable 的好处
 * 可以定义返回值
 * 可以抛出异常
 */
public class TestCallable implements Callable {
    @Override
    public Boolean call() {
        return true;
    }

    public static void main(String[] args) {

    }
}
