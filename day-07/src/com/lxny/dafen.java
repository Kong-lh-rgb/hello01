package com.lxny;

import java.util.Scanner;

public class dafen {
    public static void main(String[] args) {
        double[] score=new double[6];
        double max=0;
        int maxindex=0;
        int minindex=0;
        double min=0;
        double total=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入选手的分数：");
        for(int i=0;i<6;i++){
            System.out.println("第"+(i+1)+"得分为：");
            score[i] = sc.nextDouble();
        }
        //找最高分
        for(int j=0;j<6;j++){
            if(score[j]>max){
                max=score[j];
                maxindex=j;
            }
        }
        //找最低分
        for(int k=0;k<6;k++){
            if(score[k]<min){
                min=score[k];
                minindex=k;
            }
        }
        //去除最高分和最低分
        score[maxindex]=0;
        score[minindex]=0;
        for(int y=0;y<6;y++){
            total=total+score[y];
        }
        total=total/4;
        System.out.println("平均分为"+total);
    }
}
