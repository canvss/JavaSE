package com.canvs._override.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 19:49
 */
public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name="假老练";
        cat.age=5;
        cat.sleep();
        cat.catchTheMouse();
        Dog dog = new Dog();
        dog.name = "莽哥";
        dog.age = 7;
        dog.watchDog();
    }
}
