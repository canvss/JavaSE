package com.canvs._this;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 13:28
 */
public class Student {
    private String name;
    private  int age;

    public Student() {
    }

    public Student(String name) {
        this();
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        this.age = age;
    }
}
