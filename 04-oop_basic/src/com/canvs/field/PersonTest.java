package com.canvs.field;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 18:12
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "canvs";
        p1.age = 25;
        p1.gender = '男';
        p1.showPersonalDetails();

        Person p2= new Person();
        p2.name = "jack";
        p2.age = 22;
        p2.gender = '男';
        p2.showPersonalDetails();
        System.out.println(p1 == p2);
    }

}
