package com.magdsnail.oop.demo09;

// 抽象的思维~ Java

// interface 定义的关键字 接口都需要有实现类
public interface UserService {
    // 接口中的所有定义其实都是抽象的 public abstract
    // 常量 ~ public static final
    int AGE = 99;

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);



}
