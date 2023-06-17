package com.canvs.overload;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/15 16:12
 */
public class MathToolsTest {
    public static void main(String[] args) {
        MathTools overload = new MathTools();
        System.out.println(overload.getSum(1, 5));
        System.out.println(overload.getSum(1, 2, 3, 4, 5));
    }
}
