package com.lxny;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        double ticket1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("price:");
        double ticket=sc.nextDouble();
        System.out.println("mouth:");
        int mouth=sc.nextInt();
        System.out.println("cang:");
        String ac=sc.next();
        if(mouth>=5 && mouth<=10){
            if(ac.equals("头等舱")){
                ticket1=ticket*0.9;
            }else if(ac.equals("经济舱")){
                ticket1=ticket*0.85;
            }
        }
        if((mouth>=11 && mouth<=12) || (mouth>=1 && mouth<=4)){
            if(ac.equals("头等舱")){
                ticket1=ticket*0.7;
            }else if(ac.equals("经济舱")){
                ticket1=ticket*0.65;
            }
        }
        System.out.println("您的票价优惠后价格为："+ticket1);
    }
}