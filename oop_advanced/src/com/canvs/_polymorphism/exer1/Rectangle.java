package com.canvs._polymorphism.exer1;

import java.util.Objects;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 23:03
 */
public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle(double width, double height,String color,double weight) {
        super(color,weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return getWidth()*getHeight();
    }
}
