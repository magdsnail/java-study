package com.magdsnail.base;

public class Demo03 {
    static String name;
    int num = 1;

    public Demo03 (int num){
        this.num = num;

    }
    public static void main(String[] args) {
        Demo03 demo03 = new Demo03(3);
        demo03.add();
        new Demo03(4);
//        int i = 0x11;
//        System.out.println("huimin");
//        int i1 = 123;
//        int aa = 0x01;
//        String asdfas = "avac";
//        String[] data = new String[10];
//        for (int i2 = 0; i2 < data.length; i2++) {
//
//        }
//
//        for (String datum : data) {
//
//        }
//
//        Arrays.stream(data).forEach(x -> {
//
//        });
        System.out.println(name);
    }

    public void add() {
        System.out.println(this.num);
    }


}
