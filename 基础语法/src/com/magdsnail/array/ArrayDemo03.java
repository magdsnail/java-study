package com.magdsnail.array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
//        for (int array : arrays) {
//            System.out.println(array);
//        }
//
//        for (int array: arrays) {
//            System.out.println(array);
//        }
        int[] retData = reverse(arrays);
        printArray(retData);
    }

    public  static int[] reverse(int[] arrays) {
        int[] result = new int[arrays.length];

        for (int i = 0, j=result.length-1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }
        return result;
    }

    public static  void printArray(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i] + " ");
        }
    }
}
