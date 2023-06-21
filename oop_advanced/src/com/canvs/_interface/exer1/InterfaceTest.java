package com.canvs._interface.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 23:06
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CompareObject r1 = new ComparableRectangle(2.7,5);
        CompareObject r2 = new ComparableRectangle(2.9,5);
        System.out.println(r1.compareTo(r2));
    }
}
