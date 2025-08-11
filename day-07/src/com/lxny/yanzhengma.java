package com.lxny;

import java.util.Random;

public class yanzhengma {
    public static void main(String[] args) {
        //产生一个随机的验证码
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i]=(char)(97 + i);
            } else if (i>25) {
                chs[i]=(char)(65 + i - 26);
            }
        }
        String result="";
        Random r = new Random();
        for(int i=0; i<4; i++){
            int randomindex = r.nextInt(52);
            //System.out.println(chs[randomindex]);
            result = result + chs[randomindex];
        }
        int number = r.nextInt(20);
        result = result + number; 
        System.out.println(result);
    }
}
