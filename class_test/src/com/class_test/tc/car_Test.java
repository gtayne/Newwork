package com.class_test.tc;

public class car_Test {
    public static void main(String[] args) {
        Car c1 = new Car("lexus",600000,60);
        c1.drive();
        c1.speedChange(80);
        System.out.println(c1);
    }
}
