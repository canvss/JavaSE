package com.canvs.reflectapply.apply1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 20:39
 */
public class Person {
    private int age;
    private String name;

    private Person() {
    }

    private Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
