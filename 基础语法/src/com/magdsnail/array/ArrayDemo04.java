package com.magdsnail.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[][] array = {{1,2},{3,4}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }

    public static  void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
