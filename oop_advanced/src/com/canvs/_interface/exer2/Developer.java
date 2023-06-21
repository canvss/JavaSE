package com.canvs._interface.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 23:35
 */
public class Developer {
    private String name;
    private int age;

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
    public Developer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
