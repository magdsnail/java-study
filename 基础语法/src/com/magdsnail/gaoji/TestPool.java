package com.magdsnail.gaoji;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ClassName: TestPool
 * Package: com.magdsnail.gaoji
 * Description:
 *
 * @Date: 2023-03-10 010 15:49
 * @Author: wangkejing
 */

//测试线程池
public class TestPool {
    public static void main(String[] args) {
        //1.创建服务 创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //执行
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        service.execute(new MyThread());
        //2.关闭连接
        service.shutdown();
    }
}

class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

}
