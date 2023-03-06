package com.magdsnail.state;


import com.magdsnail.thread.demo01.TestThread4;

//模拟网络延时 放大问题的发生性
public class TestSleep implements  Runnable{

    private int ticketNums = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNums <= 0) {
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + "拿到了第" + ticketNums-- + "张票");
        }

    }

    public static void main(String[] args) {
        TestSleep ticket = new TestSleep();

        new Thread(ticket,"xiaoming").start();
        new Thread(ticket, "老师").start();
        new Thread(ticket, "黄牛党").start();
    }


}
