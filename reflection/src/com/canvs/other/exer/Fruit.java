package com.canvs.other.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 20:59
 */
public interface Fruit {
    public void squeeze();
}
class Apple implements Fruit{
    @Override
    public void squeeze() {
        System.out.println("榨杯苹果汁");
    }
}
class Orange implements Fruit{

    @Override
    public void squeeze() {
        System.out.println("榨杯橘子汁");
    }
}
class Juicer{
    public void run(Fruit f) {
        f.squeeze();
    }
}