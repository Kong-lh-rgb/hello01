package com.lxny;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        int max=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个大于等于2的整数");
        int number=sc.nextInt();
        for(int i=1;i<=number/2;i++){
            if(i*i<=number){
               max=i;
            }
        }
        System.out.println(max);
    }
}
