package com.canvs.encapsulation;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 16:48
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Canvs");
        p.setAge(23);
        System.out.println("姓名：" + p.getName() +"\t年龄：" + p.getAge());
        p.showInfo();
    }
}
