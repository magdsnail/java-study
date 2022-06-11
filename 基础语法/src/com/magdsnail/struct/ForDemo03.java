package com.magdsnail.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        int[] numbers = { 12, 20, 30 };

        for (int i = 0; i < 3; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("分割线=================");
        for (int x: numbers) {
            System.out.println(x);
        }
    }
}
