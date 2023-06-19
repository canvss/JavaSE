package com.canvs._polymorphism;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:16
 */
public class Animal {
    public void eat(){
        System.out.println("动物觅食");
    }
    public void sleep(){
        System.out.println("动物睡觉");
    }
}
class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("小猫爱吃鱼");
    }

    @Override
    public void sleep() {
        System.out.println("小猫在睡觉");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("小狗吭骨头");
    }

    @Override
    public void sleep() {
        System.out.println("小狗在睡觉");
    }
}