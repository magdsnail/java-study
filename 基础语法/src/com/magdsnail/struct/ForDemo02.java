package com.magdsnail.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        for (int j = 0; j <= 9; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(j+"*"+i+"="+(j*i) + "\t");
            }
            System.out.println();
        }

    }
}
