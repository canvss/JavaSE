package com.canvs._override.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 22:03
 */
public class Cylinder extends Circle{
    double length;

    public Cylinder() {
        this.length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return findArea()*length;
    }
}
