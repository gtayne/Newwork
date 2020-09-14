package com.bjpowernode.pojo;

public class Student {
    //特征 不能在其他类中 直接访问到  变量前  private  私有的
    //私有（自己私有  ） 只有在自己类中 可以使用  出了这个类  不能直接被点到
    //private  私有的  类    访问权限修饰符-----qq  qq空间    仅自己可见
    // public  公开的 公共的   qq空间的权限 所有的好友都可以访问空间
    // 在当前项目下 公共的内容可以被访问

    //  属性 私有化 （private） 方法 公开化（public）
    private String name;
    private String no;
    private int score;

    public void setScore(int score1){
        if(score1>0){
            score=score1;
        }else{
            score=0;
        }

    }
    public void setName(String name1){
        name=name1;
    }
    public void setNo(String no1){
        no=no1;
    }

    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
    public String getNo(){
        return no;
    }








    public String toString(){
        return "no: "+no+",name: "+name+",score: "+score;
    }





}
