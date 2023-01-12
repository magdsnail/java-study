package com.magdsnail.exception.demo03;
public class aa {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        // ctrl + alt + t 可选择使用的代码块
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            System.exit(0);
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
