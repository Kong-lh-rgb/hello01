package com.lxny;

public class gapdemo01 {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i==3){
                continue;//跳过本次循环，继续下次循环
                //break吃到第三个跳出循环
            }
            System.out.println("吃第"+i+"个包子");
        }
    }
}
