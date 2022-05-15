package com.magdsnail.operator;

//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        // x ? y : z
        int score = 80;
        String type = score < 60 ? "不及格" : "及格";
        System.out.println(type);
    }
}
