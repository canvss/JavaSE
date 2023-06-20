package com.canvs._extends;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:07
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getInfo(){
        System.out.println("姓名："+name+" 年龄："+age);

    }
}
