package com.canvs._throw.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 21:58
 */
public class Triangle {
    private double a;
    private double b;
    private double c;
    public Triangle(double a,double b,double c){
        if (a<=0||b<=0||c<=0){
            throw new NotTriangleException("三角形的变不能为小于0");
        }
        if(a+b<=c || a+c<=b || c+b<=a){
            throw new NotTriangleException("不构成三角形，三角形任意两边和大于第三边");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
