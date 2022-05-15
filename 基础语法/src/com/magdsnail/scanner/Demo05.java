package com.magdsnail.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            m++;
            sum+=x;
            System.out.println("你输入了第"+m+"个数据，然后当前结果sum="+sum);
        }

        System.out.println(m + "个数的和为" + sum);
        System.out.println(m + "个数的平均值为" + (sum / m));

        scanner.close();
    }
}