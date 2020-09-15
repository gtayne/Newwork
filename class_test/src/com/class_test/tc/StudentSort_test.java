package com.class_test.tc;

public class StudentSort_test {
    public static void main(String[] args) {
        StudentSort s1 = new StudentSort(1,"naruto",80);
        StudentSort s2 = new StudentSort(2,"susake",70);
        StudentSort s3 = new StudentSort(3,"gty",90);
        int arr_num_score[] = {s1.getNum(),s1.getScore(),s2.getNum(),s2.getScore(),s3.getNum(),s3.getScore()};
        int arr_score[] = {arr_num_score[1],arr_num_score[3],arr_num_score[5]};
        for(int i=0;i<arr_num_score.length-1;i+=2){
            for(int j=0;j<arr_num_score.length-1;j++){
                if(arr_score[j]>arr_score[j+1]){
                    int temp;
                    temp = arr_score[j];
                    arr_score[j]=arr_score[j+1];
                    arr_score[j+1]=temp;
                }
            }
            for(int a:arr_score){
                System.out.println(a);
            }

        }

    }

}
