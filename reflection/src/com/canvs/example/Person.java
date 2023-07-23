package com.canvs.example;

import java.io.Serializable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 16:12
 */
public class Person implements Biology, Serializable {
    public String name;
    public int age;
    private char gender;
    private static int score = 100;
    public static String occupation = "律师";

    public Person() {
        System.out.println("Person...");
    }

    private Person(char gender) {
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person(String name,int age)");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public static void info(String gender) {
        System.out.println("gender:" + gender);
    }
    private static void show(String name,int age){
        System.out.println("show method...");
    }
    public static void show1(){};
}
