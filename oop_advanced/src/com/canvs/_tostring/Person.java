package com.canvs._tostring;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 00:05
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{"+"name="+name+",age="+age+"}";
    }
}
