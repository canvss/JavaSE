package com.canvs._polymorphism;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:29
 */
public class Person {
    private Animal animal;

    public void adopt(Animal animal){
        this.animal = animal;
    }
    public void feed(){
        animal.eat();
    }
}
