package com.canvs._interface.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 23:42
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电动车通过点来行驶");
    }

    public ElectricVehicle() {
    }

    @Override
    public void power() {
        System.out.println("电动车通过电机来增加动力");
    }
}
