package com.magdsnail.exception.demo02;

public class Test {
    public static void main(String[] args) {
        try {
            new Test().test(1, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }


    }

    //假设这方法中 处理不了这个异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException();//主动抛出异常
        }
    }

    /**
     *  int a = 1;
     *         int b = 0;
     *
     *         //截获多个异常错误从小到大
     *         try {
     *             if (b == 0) {
     *                 throw new ArithmeticException();//主动抛出异常
     *             }
     *             System.out.println(a / b);
     *         } catch (Error e) {
     *             System.out.println("Error");
     *         } catch (Exception e) {
     *             System.out.println("程序出现异常");
     *         } catch (Throwable t) {
     *             System.out.println("Throwable");
     *         } finally {
     *             System.out.println("finally");
     *         }
     */
}
