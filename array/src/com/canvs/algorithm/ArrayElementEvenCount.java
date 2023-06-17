package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 19:17
 * 统计偶数个数
 */
public class ArrayElementEvenCount {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
