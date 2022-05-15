package com.magdsnail.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用nextLine方式接收：");

        if(scanner.hasNextLine()) {
            String str = scanner.nextLine();

            System.out.println("输出内容为："+ str);
        }

        scanner.close();
    }
}
