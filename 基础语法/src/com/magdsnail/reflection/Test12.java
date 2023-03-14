package com.magdsnail.reflection;

import javafx.scene.control.Tab;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * ClassName: Test12
 * Package: com.magdsnail.reflection
 * Description: 练习反射操作注解
 *
 * @Date: 2023-03-14 014 09:48
 * @Author: wangkejing
 */
public class Test12 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("com.magdsnail.reflection.Student2");

        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }


        //获得注解的value值
        Tablekuang tablekuang = (Tablekuang) c1.getAnnotation(Tablekuang.class);
        String value = tablekuang.value();
        System.out.println(value);


        //获得类指定的注解
        Field f = c1.getDeclaredField("name");
        Filekuang annotation = f.getAnnotation(Filekuang.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());

    }
}

@Tablekuang("db_student")
class Student2 {
    @Filekuang(columnName = "db_id", type = "int", length = 10)
    private  int id;

    @Filekuang(columnName = "db_age", type = "int", length = 10)
    private int age;

    @Filekuang(columnName = "db_name", type = "varchar", length = 3)
    private String name;

    public Student2() {
    }

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//类名的注解
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Tablekuang{
    String value();
}


//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filekuang{
    String columnName();
    String type();
    int length();
}