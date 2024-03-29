package com.magdsnail.state;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时，，，
public class TestSleep2 {

    public static void tenDown() {
        int num = 10;
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(num--);
            if(num <= 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
        Date startTime = new Date(System.currentTimeMillis());//获取系统当前系统时间
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime = new Date(System.currentTimeMillis());//更新当前时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
