package com.lxny;

public class demo3 {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,55};
        printarr(arr);
    }
    public static void printarr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
