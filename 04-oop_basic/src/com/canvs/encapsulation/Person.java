package com.canvs.encapsulation;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 16:45
 */
public class Person {
    private String name;
    private int age;

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

    public void showInfo(){
        System.out.println(stringUtil());
    }

    private String stringUtil(){
        return "【 姓名："+name+"   年龄："+age+" 】";
    }
}
