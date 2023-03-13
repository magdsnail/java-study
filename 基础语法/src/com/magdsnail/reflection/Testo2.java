package com.magdsnail.reflection;


import java.util.zip.CRC32;

/**
 * ClassName: Testo2
 * Package: com.magdsnail.reflection
 * Description:
 *
 * @Date: 2023-03-11 011 15:17
 * @Author: wangkejing
 */

//什么叫反射
public class Testo2 {
    public static void main(String[] args) {
        //通过反射获取类的class对象
        try {
            Class c1 = Class.forName("com.magdsnail.reflection.User");
            System.out.println(c1);


            Class c2 = Class.forName("com.magdsnail.reflection.User");
            Class c3 = Class.forName("com.magdsnail.reflection.User");
            Class c4 = Class.forName("com.magdsnail.reflection.User");

            //一个类在内存中只有一个class对象
            //一个类被加载后 类的整个结构都会被封装在class对象中
            System.out.println(c2.hashCode());
            System.out.println(c3.hashCode());
            System.out.println(c4.hashCode());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


//实体类 entity | pojo
class User{
    private  String name;
    private int id;
    private int age;

    public User() {

    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}