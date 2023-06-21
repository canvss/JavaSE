package com.canvs._interface.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 23:39
 */
public abstract class Vehicle {
    private String brand;
    private String color;

    public abstract void run();
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Vehicle() {
    }

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
