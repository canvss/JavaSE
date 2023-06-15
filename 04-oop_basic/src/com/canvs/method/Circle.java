package com.canvs.method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 19:56
 */
public class Circle {
    double radius;
    public double area(){
        return radius*radius*3.14;
    }
    public double circumference(){
        return radius*2*Math.PI;
    }
}
