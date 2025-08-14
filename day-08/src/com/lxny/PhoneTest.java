package com.lxny;

public class PhoneTest {
    public static void main(String[] args) {
        //创建手机的对象
        phone p = new phone();
        p.brand = "小米";
        p.price = 1999;

        //获取对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playgame();
    }
}
//封装：对象代表什么，就要封装对应的数据，并提供数据对应的行为 例如人关门，关门在门的类里面，人调用门的关门方法来实现关门
