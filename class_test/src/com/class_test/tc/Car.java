package com.class_test.tc;

public class Car {
    private String mark;
    private int price;
    private int speed;
    public Car(String mark1,int price1,int speed1){
        mark=mark1;
        price=price1;
        speed=speed1;
    }
    public String toString(){
        return "速度为"+speed;
    }
    public void setSpeed(int speed1){
        speed = speed1;
    }
    public void drive(){
        System.out.println("驾驶功能");
    }
    public void speedChange(int newSpeed){
        speed=newSpeed;
        System.out.println(speed);
    }
}
