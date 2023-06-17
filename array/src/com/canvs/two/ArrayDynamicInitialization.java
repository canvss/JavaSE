package com.canvs.two;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 22:06
 * 动态初始化
 */
public class ArrayDynamicInitialization {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[1] = new int[]{1, 2, 3, 4};
        arr[2] = new int[]{1, 2, 3, 4};

        String[][] arr2 = new String[2][3];
        arr2 = new String[][]{{"Java", "C++", "Python"}, {"风清扬", "东方不败", "令狐冲"}};
    }
}
