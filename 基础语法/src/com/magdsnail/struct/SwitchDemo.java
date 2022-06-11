package com.magdsnail.struct;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        //case 穿透 swtich 匹配一个具体的值
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            default:
                System.out.println("Default");
        }
    }
}
