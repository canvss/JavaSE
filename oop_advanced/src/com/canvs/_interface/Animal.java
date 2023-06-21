package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 20:40
 */
public  interface Animal {
    void eat();
}

class AnimalTest{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  //狗吭骨头
        dog.breathe();  //小狗呼吸新鲜空气
    }
}