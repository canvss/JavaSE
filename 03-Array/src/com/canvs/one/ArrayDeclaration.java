package com.canvs.one;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 14:02
 * 一维数组声明
 */
public class ArrayDeclaration {
    public static void main(String[] args) {
        int [] ages = new int[]{1,2,3,5,6,8};
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i]+"\t");
        }

        float price[] = new float[4];
        price[0] = 17.5f;
        price[2] = 10.3f;

        double[] price2 = {18.5,17.2,20.5};
        for (int i = 0; i < price2.length; i++) {
            System.out.print(price2[i]+"\t");
        }

        String [] foods;
        foods = new String[]{"麻婆豆腐","宫保鸡丁","青椒肉丝"};
        System.out.println(foods);  //[Ljava.lang.String;@1540e19d

    }
}
