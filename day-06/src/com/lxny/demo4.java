package com.lxny;

public class demo4 {
    public static void main(String[] args) {
        int[] arr={1,2,7,4,5};
        System.out.println(findmax(arr));
    }
    public static int findmax(int[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
