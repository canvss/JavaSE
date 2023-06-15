package com.canvs.method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 19:59
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 2.7;
        System.out.println("面积："+ circle.area());
        System.out.println("周长："+ circle.circumference());
    }
}
