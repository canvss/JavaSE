package com.canvs.exercises;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/15 17:40
 */
public class PassObject {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Radius\t\t"+"Area");
        for (int i = 1; i <=5; i++) {
            printAreas(circle,i);
        }
    }
    public static void printAreas(Circle c , int time){
        c.radius = time;
        System.out.println(c.radius+"\t\t\t"+c.area());
    }
}
