package com.canvs._super.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 22:48
 */
public class Father {
    String name;
    int age;
    int id;

    public Father() {
    }

    public Father(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
}
class Son extends Father{
    int age;
    public Son(String name, int age, int id) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public int getSuperAge(){
        return super.age;
    }
    public String getName(){
        return this.name;
    }
}