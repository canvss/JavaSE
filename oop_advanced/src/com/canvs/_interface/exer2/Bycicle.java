package com.canvs._interface.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 23:40
 */
public class Bycicle extends Vehicle{
    public Bycicle() {
    }

    public Bycicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("行车通过人力脚蹬行驶");
    }
}
