package com.canvs.selfdefine.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 21:30
 */
public class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
