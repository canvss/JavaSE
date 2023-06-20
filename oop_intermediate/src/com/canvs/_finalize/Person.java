package com.canvs._finalize;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 13:39
 */
public class Person {
    private String name;
    private int age;
    Person(String name,int age){
        this.name =name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("被释放的对象"+this);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
