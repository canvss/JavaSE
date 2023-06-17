package com.canvs.overload;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/15 16:10
 */
public class MathTools {
    public int getSum(int i, int j) {
        return i + j;
    }

    public int getSum(int... arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];
        }
        return sum;
    }
}
