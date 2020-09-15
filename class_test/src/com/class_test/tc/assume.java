package com.class_test.tc;

public class assume {
    String xm;
    String xb;
    int nl;
    String jtzz;
    String xl;
    public assume(String xm1,String xb1,int nl1,String jtzz1,String xl1){
        xm=xm1;
        xb=xb1;
        nl=nl1;
        jtzz=jtzz1;
        xl=xl1;
    }
    public String toString(){
        return "姓名为:"+xm+"性别:"+xb+"年龄:"+nl+"家庭住址："+jtzz+"学历"+xl;
    }
}
