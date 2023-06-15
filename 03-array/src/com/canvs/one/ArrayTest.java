package com.canvs.one;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 18:39
 */
public class ArrayTest {
    public static void main(String[] args) {
        String [] foods = new String[]{"麻婆豆腐","宫保鸡丁","青椒肉丝"};
        String [] foods2 = new String[3];
        foods2 = foods;
        System.out.println(foods);  //[Ljava.lang.String;@1540e19d
        System.out.println(foods2); //[Ljava.lang.String;@1540e19d
    }
}
