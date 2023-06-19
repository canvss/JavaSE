package com.canvs._polymorphism;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:33
 */
public class PetShop {
    public Animal sale(String type) {
        switch (type) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
        }
        return null;
    }
    public static void main(String[] args) {
        PetShop ps = new PetShop();
        Animal dog = ps.sale("Dog");
        dog.eat();
        dog.sleep();
    }
}
