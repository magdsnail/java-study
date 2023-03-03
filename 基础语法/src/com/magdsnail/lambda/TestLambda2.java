package com.magdsnail.lambda;

public class TestLambda2 {
    public static void main(String[] args) {
        ILove love = null;

        //1.lambda 表示简化
        love = (int a) -> {
            System.out.println("i lover--->"+a);
        };
        //简化1.参数类型
        love = (a) -> {
            System.out.println("i lover--->"+a);
        };

        //简化2.简化括号
        love = a->{
            System.out.println("i lover--->"+a);
        };

        //简化3.去掉花括号
        love = a-> System.out.println("i lover--->"+a);

        //总结：
            //lambda 表达式只能有一行代码的情况下才能简化成为一行 如果有多行就用代码块包裹
            //前提是接口为函数式接口
            //多个参数也可以去掉参数类型 要去掉就都去掉

        love.love(2);
    }
}

interface ILove{
    void love(int a);
}