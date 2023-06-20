package com.canvs._polymorphism.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 22:59
 */
public class Circle extends GeometricObject{
    private double radius;
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius =radius;
    }

    @Override
    public double findArea() {
        return Math.PI*2*this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
