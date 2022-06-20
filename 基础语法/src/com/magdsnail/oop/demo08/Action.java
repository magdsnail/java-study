package com.magdsnail.oop.demo08;

public abstract  class Action {
    //abstract 抽象方法 只有方法名字 没有方法的实现
    public abstract void doSomething();

//    不能new这个抽象类 智能靠子类去实现它 约束
//    抽象类中可以写普通的方法
//      抽象方法必须在抽象类中
}
