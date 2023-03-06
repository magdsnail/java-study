package com.magdsnail.state;


//测试线程优先级
public class TestPriority extends Thread {
    public static void main(String[] args) {
        //主线程默认优先级
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());

        MyProject myProject = new MyProject();

        Thread t1 = new Thread(myProject);
        Thread t2 = new Thread(myProject);
        Thread t3 = new Thread(myProject);
        Thread t4 = new Thread(myProject);

        //先设置优先级 在启动
        t1.start();


        t2.setPriority(1);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY);
        t4.start();

    }

}

class MyProject implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}
