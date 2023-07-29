package com.canvs.grammar.record;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 21:12
 */
public record Dog(String name, Integer age) {
}

class DogTest{
    public static void main(String[] args) {
        Dog dog = new Dog("莽哥",12);
        System.out.println(dog.name()); //莽哥
        Dog dog2 = new Dog("旺财",7);
        System.out.println(dog.equals(dog2));   //false
        System.out.println(dog2);   //Dog[name=旺财, age=7]
    }
}