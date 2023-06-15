package com.canvs.field;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 18:10
 */
public class Person {
    String name;
    int age;
    char gender;

    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(int hour){
        System.out.println("睡觉：" + hour + "小时");
    }
    public void showPersonalDetails(){
        System.out.println("姓名："+name+ "  年龄："+age+"  性别："+gender);
    }
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
}
