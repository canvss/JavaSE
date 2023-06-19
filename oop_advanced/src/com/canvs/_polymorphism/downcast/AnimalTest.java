package com.canvs._polymorphism.downcast;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 22:27
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest animal = new AnimalTest();
        animal.adopt(new Dog());
        animal.adopt(new Cat());
    }
    public void adopt(Animal animal){
        animal.eat();
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchDog();
        }else if(animal instanceof  Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
