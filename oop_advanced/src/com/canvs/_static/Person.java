package com.canvs._static;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 21:39
 */
public class Person {
    private String name;
    private static String nation;

    public static String getNation() {
        return nation;
    }

    public static void setNation(String nation) {
        Person.nation = nation;
    }


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
