package com.canvs._override.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 19:56
 */
public class Circle {
    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return radius*radius*3.14;
    }
}
