package com.lxny;

import java.util.Scanner;

public class xunhuan {
    public static void main(String[] args) {
        //分支语句if和switch
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入您的成绩：");
        int score=scanner.nextInt();
        if(score>2){
            System.out.println("nice!");
        }else{
            System.out.println("never give up!");
        }
    }
}
