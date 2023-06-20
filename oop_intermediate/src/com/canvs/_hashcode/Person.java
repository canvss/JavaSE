package com.canvs._hashcode;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 00:05
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{"+"name="+name+",age="+age+"}";
    }
}
class PersonTest{
    public static void main(String[] args) {
        Person p = new Person("canvs",12);
        System.out.println(p.getClass());   //class com.canvs._hashcode.Person
        System.out.println("canvs".hashCode()); //94427789
        System.out.println("A".hashCode()); //65
    }
}