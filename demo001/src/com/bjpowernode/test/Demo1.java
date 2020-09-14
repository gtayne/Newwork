package com.bjpowernode.test;

import com.bjpowernode.pojo1.Cat;

public class Demo1 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(1);
        cat.setNikeName("tomcat");
        cat.setLength(20);
        System.out.println(cat);
    }
}
