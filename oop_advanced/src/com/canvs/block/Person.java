package com.canvs.block;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 23:08
 */
public class Person {
    private static String name;
    private static int age;

    public Person() {
    }
    static {
        Person.name = "Canvs";
        Person.age = 20;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Person.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Person.age = age;
    }
}
