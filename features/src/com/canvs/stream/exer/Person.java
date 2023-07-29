package com.canvs.stream.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 17:00
 */
public class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + "]";
    }
}
