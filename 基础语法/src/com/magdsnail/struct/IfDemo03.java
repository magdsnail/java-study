package com.magdsnail.struct;

import java.util.Scanner;

public class IfDemo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");

        int score = scanner.nextInt();

        if(score == 100) {
            System.out.println("恭喜满分");
        } else if(score < 100 && score >= 90) {
            System.out.println("A级");
        } else if(score < 60 && scroe > 0) {
            System.out.println("不及格");
        } else {
            System.out.println("输入不合法");
        }

        scanner.close();
    }
}
