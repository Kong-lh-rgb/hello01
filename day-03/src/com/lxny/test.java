package com.lxny;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        //键盘录入三位数获取各位数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int number=sc.nextInt();
        int a=number%10;
        int b=number/10%10;
        int c=number/100;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
