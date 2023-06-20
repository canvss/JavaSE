package com.canvs.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 22:06
 */
public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.7);
        System.out.println("圆柱体积："+cylinder.findVolume());
        System.out.println("圆柱表面积："+cylinder.findArea());
    }
}
