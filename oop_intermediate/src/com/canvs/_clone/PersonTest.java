package com.canvs._clone;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 00:10
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom", 22);
        try {
            Person p2 = (Person) p.clone();
            System.out.println(p);
            System.out.println(p2);
            System.out.println(p == p2);
            System.out.println(p.equals(p2));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
