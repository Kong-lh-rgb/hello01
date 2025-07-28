package com.lxny;

public class test1 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            int a=i%100;
            int b=i/10%10;
            int c=i/100;
            if(i%7==0||a==7||b==7||c==7){
                System.out.println("i="+i+"是7的倍数或包含7");
            }
        }
    }
}
