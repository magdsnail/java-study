package com.magdsnail.syn;

//不安全的买票
public class UnsafeBuyTicket {
    public static void main(String[] args) {
        BuyTicket station = new BuyTicket();


        new Thread(station, "苦逼的我").start();
        new Thread(station, "牛逼的你").start();
        new Thread(station, "可恶的黄牛党").start();
    }
}

class BuyTicket implements Runnable{

    private int ticketNum = 10;
    boolean flag = true;//外部停止方式
    @Override
    public void run() {
        //买票
        while (flag) {
            try {
                buy();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    private synchronized void buy() {
        //判断是否有票
        if(ticketNum <=0 ) {
            flag = false;
            return;
        }

        //模拟延时
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //买票
        System.out.println(Thread.currentThread().getName() + "拿到"+ticketNum--);
    }


}
