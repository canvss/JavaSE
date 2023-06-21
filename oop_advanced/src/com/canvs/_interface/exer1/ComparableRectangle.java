package com.canvs._interface.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 22:59
 */
public class ComparableRectangle extends Rectangle implements CompareObject {
    public ComparableRectangle() {
    }

    public ComparableRectangle(double length, double high) {
        super(length, high);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o) {
            return 1;
        }
        if(o instanceof ComparableRectangle){
            ComparableRectangle c = (ComparableRectangle) o;
            if (c.findArea() > this.findArea()){
                return 1;
            }else if(c.findArea() < this.findArea()){
                return -1;
            }else {
                return 0;
            }
        }
        throw new RuntimeException("输入有误！");
    }

    @Override
    public double findArea() {
        return this.getLength() * this.getHigh();
    }
}
