package com.canvs._polymorphism;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:19
 */
public class AnimalTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.adopt(new Cat());
        person.feed();
    }
}
