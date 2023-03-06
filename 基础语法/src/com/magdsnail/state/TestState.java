package com.magdsnail.state;

public class TestState {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("////////////");
        });

        //观察状态
        Thread.State state = thread.getState();
        try {
            System.out.println(state);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        //观察启动后
        thread.start();//启动线程
        state = thread.getState();
        System.out.println(state);//run

        while (state != Thread.State.TERMINATED){ //只要线程不终止 就一直输出状态
            Thread.sleep(100);
            state = thread.getState();//更新线程状态
            System.out.println(state);//输出状态
        }




    }
}
