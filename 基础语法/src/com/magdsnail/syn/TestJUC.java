package com.magdsnail.syn;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * ClassName: TestJUC
 * Package: com.magdsnail.syn
 * Description:
 *
 * @Date: 2023-03-09 009 17:11
 * @Author: wangkejing
 */

//测试JUC安全类型集合
public class TestJUC {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(list.size());

    }
}
