package com.canvs.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 22:03
 */
public class Cylinder extends Circle {
    double length;

    public Cylinder() {
        this.length = 3;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume() {
        return super.findArea() * getLength();
    }

    @Override
    public double findArea() {
        return super.findArea() * 2 + 2 * getRadius() * Math.PI * getLength();
    }
}
