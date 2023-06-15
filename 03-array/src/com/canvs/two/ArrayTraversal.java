package com.canvs.two;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 22:14
 * 数组遍历
 */
public class ArrayTraversal {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[1] = new int[]{1, 2, 3, 4};
        arr[2] = new int[]{1, 2, 3, 4};

        String[][] arr2 = new String[2][3];
        arr2 = new String[][]{{"Java", "C++", "Python"}, {"风清扬", "东方不败", "令狐冲"}};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
