package com.lxny;

import java.util.Scanner;

public class xuanze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("您想吃什么：");
        String food=sc.next();
        //for和while与c语言没区别
        // switch语句
        switch(food){
            case "兰州拉面":
                System.out.println("吃拉面");
                break;
            case "热干面":
                System.out.println("吃热干面");
                break;
            case "炸酱面":
                System.out.println("吃炸酱面");
                break;
            default:
                System.out.println("没有这个饭");
        }
    }
}
