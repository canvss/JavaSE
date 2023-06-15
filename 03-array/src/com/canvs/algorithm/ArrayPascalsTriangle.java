package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 18:54
 * 杨辉三角形
 */
public class ArrayPascalsTriangle {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
            }
        }
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
