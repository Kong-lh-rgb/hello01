package com.lxny;

import java.util.Scanner;

public class yunusanfu {
    public static void main(String[] args) {
        System.out.println(3 + 2);
        System.out.println(5 * 7);
        System.out.println(5 / 2);
        System.out.println(5 % 2);

        //三元运算符
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int max=number1>number2?number1:number2;
        System.out.println(max);
    }
}
