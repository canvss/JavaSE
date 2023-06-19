package com.canvs.exer3;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 12:35
 */
public class Creature {
    public Creature() {
        System.out.println("Creature无参构造器");
    }
}

class Animal extends Creature {
    public Animal(String name) {
        System.out.println("Animal无参构造器" + "姓名：" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal无参构造器" + "  年龄：" + age);
    }
}

class Dog extends Animal {
    public Dog() {
        super("假老练", 8);
        System.out.println("Dog无参构造器");
    }

    public static void main(String[] args) {
        new Dog();
    }
}