package com.magdsnail.syn;

import com.magdsnail.thread.demo01.TestThread4;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: UnsafeList
 * Package: com.magdsnail.syn
 * Description:
 *
 * @Date: 2023-03-09 009 16:33
 * @Author: wangkejing
 */
public class UnsafeList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(list.size());

    }
}
