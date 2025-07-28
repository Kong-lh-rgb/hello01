package com.lxny;

public class arraydemo {
    public static void main(String[] args) {
        //定义数组
        int[] arr={1,2,3,4,5};
        //遍历数组
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //动态初始化数组
        int[] arr1=new int[5];
        System.out.println(arr1[1]);
    }
}
