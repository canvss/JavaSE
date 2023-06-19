package com.canvs._clone;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 00:05
 */
public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ",age=" + age + "}";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Person) return this.name.equals(((Person) obj).name) && this.age == ((Person) obj).age;
        return false;
    }
}
