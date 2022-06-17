package com.magdsnail.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a = {1,3,5,6,34,56,89};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Arrays.fill(a, 0);

    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if(i == 0) {
                System.out.println("[");
            }
            if(i == a.length - 1) {
                System.out.println(a[i] + "]");
            } else {
                System.out.println(a[i] + ",");
            }
        }
    }
}
