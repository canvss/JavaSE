package com.canvs._polymorphism.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 22:57
 */
public class GeometricObject {
    private String color;
    private double weight;

    public GeometricObject(){

    }
    public GeometricObject(String color,double weight){
        this.color = color;
        this.weight = weight;
    }
    public double findArea(){
        return 0.0;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
