package com.canvs._class;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 18:01
 */
public class User {
    private String name;
    public int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("show Method");
    }

    private String showNation(String nation) {
        return "国籍 :" + nation;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
