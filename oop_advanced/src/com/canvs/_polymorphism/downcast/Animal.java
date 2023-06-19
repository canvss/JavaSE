package com.canvs._polymorphism.downcast;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:16
 */
public class Animal {
    public void eat(){
        System.out.println("动物觅食");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("小猫爱吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("小狗吭骨头");
    }

    public void watchDog(){
        System.out.println("狗看门");
    }
}