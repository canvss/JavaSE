package com.canvs.reflectapply.data;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 21:00
 */
@MyAnnotation("t_persons")
public class Person extends Creature<String> implements Comparable<Person>, MyInterface {
    private String name;
    public int age = 1;
    @MyAnnotation("info")
    private static String info;

    public Person() {
        System.out.println("person...");
    }

    protected Person(int age) {
        this.age = age;
    }

    private Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() throws RuntimeException, ClassNotFoundException {
        System.out.println("show method..");
    }
    @MyAnnotation(value="show_nation")
    private String showNation(String nation) {
        System.out.println("showNation method..");
        return "我的国籍 : " + nation;
    }

    @Override
    public void method() {

    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public static void showInfo() {
        System.out.println("showInfo method...");
    }
}