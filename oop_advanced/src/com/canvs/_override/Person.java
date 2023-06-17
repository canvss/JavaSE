package com.canvs._override;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 15:34
 */
public class Person {
    String name;
    int age;
    public String personInfo(){
        return "姓名："+name+" 年龄："+age;
    }
}
class Student extends Person{
    private String school;
}