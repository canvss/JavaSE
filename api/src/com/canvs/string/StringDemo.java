package com.canvs.string;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 11:49
 */
public class StringDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";
        System.out.println(p1==p2); //false
    }
}
class Person{
    String name;
}