package com.magdsnail.thread.demo01;

//创建线程方式-:继承 thread 类 重写run()方法 调用start开启线程
//总结： 注意，线程开启不一定立即执行 由CPU调度执行
public class TestThred1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在看代码----" + i);
        }
    }
    public static void main(String[] args) {
        //main线程 主线程

        //创建一个主线程
        TestThred1 testThred1 = new TestThred1();
        //调用start() 方法开启线程
        testThred1.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程--" + i);
        }

    }
}
