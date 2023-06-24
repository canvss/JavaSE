package com.canvs._throw.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 22:03
 */
public class TriangleTest {
    public static void main(String[] args) {
        try {
//            Triangle t = new Triangle(7,3,2);
            Triangle t = new Triangle(7,3,-2);
            System.out.println(t);
        }catch (NotTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
