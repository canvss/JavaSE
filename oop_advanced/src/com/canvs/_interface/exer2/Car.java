package com.canvs._interface.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 23:46
 */
public class Car extends Vehicle implements IPower{
    private String carNumer;

    public String getCarNumer() {
        return carNumer;
    }

    public Car() {}

    public Car(String brand, String color, String carNumer) {
        super(brand, color);
        this.carNumer = carNumer;
    }

    public void setCarNumer(String carNumer) {
        this.carNumer = carNumer;
    }

    @Override
    public void power() {
        System.out.println("汽车通过汽油增加动力");
    }

    @Override
    public void run() {
        System.out.println("汽车通过发动机行驶");
    }
}
