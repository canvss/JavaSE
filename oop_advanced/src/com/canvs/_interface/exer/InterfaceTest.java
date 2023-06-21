package com.canvs._interface.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 22:50
 */
public class InterfaceTest {
    public static void main(String[] args) {
        CompareObject c1 = new ComparableCircle(2.7);
        CompareObject c2 = new ComparableCircle(2.8);
        System.out.println(c1.compareTo(c2));
    }
}
