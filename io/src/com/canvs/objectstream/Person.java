package com.canvs.objectstream;

import java.io.Serializable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 20:13
 */
public class Person implements Serializable {
    public static int id;
    public String name;
    public int age;
    public transient String address;
    static final long serialVersionUID = 54156158121515125L;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "id="+id+" name="+name+" age="+age+" address="+address;
    }
}
