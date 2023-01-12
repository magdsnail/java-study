package com.magdsnail.struct;

public class ForDemo {
    public static void main(String[] args) {
//        for (int i = 0; i < ; i++) {
//            System.out.println(i);
//        }

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        System.out.println(oddSum);
        System.out.println(evenSum);


        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println();
//                System.out.println("\n");
            }
        }

    }
}
