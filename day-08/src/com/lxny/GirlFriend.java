package com.lxny;

public class GirlFriend {
    private String name;
    private int age;
    public void setAge(int a){
        if(a>=18 && a<=40){
            age = a;
        }
        else{
            System.out.println("年龄不对");
        }
    }
    public int getAge(){
        return age;
    }

    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}
