package com.canvs.one;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 13:46
 * 数组默认属性
 */
public class ArrayDefaultAttribute {
    public static void main(String[] args) {
        int [] scores = new int[4];
        System.out.println(scores[2]);  //输出 0
        double [] price = new double[4];
        System.out.println(price[1]);   //输出0.0
        float [] price2 = new float[3];
        System.out.println(price2[2]);  //输出0.0
        boolean [] flag = new boolean[2];
        System.out.println(flag[1]);    //输出false
        char gender[] = new char[4];
        System.out.println(gender[3]);  //输出0
        if (gender[3] == 0){
            System.out.println("gender == 0");
        }
        String [] foods = new String[10];   //null
        System.out.println(foods[2]);
    }
}
