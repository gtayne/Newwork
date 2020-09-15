package com.class_test.tc;

public class StudentSort {
    private String name;
    private int num;
    private int score;
    public String toString(){
        return num+name+score;
    }
    public  StudentSort(int num1,String name1,int score1){
        num=num1;
        name=name1;
        score=score1;
    }

    public int getNum() {
        return num;
    }
    public int getScore(){
        return score;
    }

    public String getName() {
        return name;
    }
}
