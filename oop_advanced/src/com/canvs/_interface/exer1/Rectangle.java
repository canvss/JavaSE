package com.canvs._interface.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 22:57
 */
public abstract class Rectangle {
    private double length;
    private double high;

    public Rectangle(double length, double high) {
        this.length = length;
        this.high = high;
    }
    public abstract double findArea();
    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
