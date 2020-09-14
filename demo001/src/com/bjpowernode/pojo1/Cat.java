package com.bjpowernode.pojo1;

public class Cat {
    private String nikeName;
    private int age;
    private int length;
    public void setNikeName(String nikeName1){
        nikeName=nikeName1;
    }
    public String getNikeName(){
        return nikeName;
    }
    public void setAge(int age1){
        age=age1;
    }
    public int getAge(){
        return age;
    }
    public void setLength(int length1) {
        length=length1;
    }
    public int getLength(){
        return length;
    }
    public String toString(){
        return "nikeName: "+nikeName+",age: "+age+",length: "+length;
    }
}
