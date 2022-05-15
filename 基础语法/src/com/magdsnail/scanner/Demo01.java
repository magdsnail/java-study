package com.magdsnail.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方式接收：");

        if(scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("输出内容为" + str);
        }

        scanner.close();//io 操作如果不关闭会一直占用资源 要养成好习惯用完关掉

    }
}
