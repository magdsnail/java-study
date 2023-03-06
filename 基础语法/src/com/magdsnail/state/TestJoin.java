package com.magdsnail.state;


//测试join方法、、想象为插队
public class TestJoin implements Runnable{

    public static void main(String[] args) {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();

        //主线程
        for (int i = 0; i <= 1000; i++) {
            if(i == 200) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
            }
            System.out.println("main"+i);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了"+i);
        }
    }
}