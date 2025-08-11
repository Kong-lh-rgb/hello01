package com.lxny;

import java.util.Random;
//抽奖
public class choujjiang {
    public static void main(String[] args) {
        int[] arr = {2,588,888,1000,10000};
        int[] newarr = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < 5; ) {
            int randomindex = r.nextInt(arr.length);
            int prize = arr[randomindex];
            if(!contains(newarr,prize)){
                newarr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newarr.length; i++) {
            System.out.println(newarr[i]);
        }
    }

    //判断prize在数组是否存在
    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==prize) {
                return true;
            }
        }
        return false;
    }
}
