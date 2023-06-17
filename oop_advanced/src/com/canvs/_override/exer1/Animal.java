package com.canvs._override.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 19:44
 */
public class Animal {
    String name;
    int age;

    public void sleep() {
        System.out.println(name + "在睡觉...");
    }
}

class Cat extends Animal {
    public void catchTheMouse() {
        System.out.println(name + "在抓老鼠...");
    }
}

class Dog extends Animal {
    public void watchDog() {
        System.out.println(name + "在看门...");
    }
}