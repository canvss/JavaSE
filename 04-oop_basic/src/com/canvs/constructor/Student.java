package com.canvs.constructor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:10
 */
public class Student {
    private String name;
    private int age;

    public Student(){   //无参构造器

    }
    public Student(String n,int a){ //构造器重载
        name = n;
        age = a;
    }
    public String studentInfo(){
        return "姓名："+name+"  年龄："+age;
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
}
