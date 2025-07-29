package com.lxny;

public class demo2 {
    public static void main(String[] args) {
        //带返回值的方法
        sum(10,20);//直接调用
        int s=sum(10,40);
        System.out.println(s);
        //输出调用
        System.out.println(sum(20,60));
    }
    public static int  sum(int a,int b){
        int result=a+b;
        return result;
    }
}
