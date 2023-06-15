package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 21:05
 * 二分查找
 */
public class ArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{-99, -54, -2, 0, 2, 33, 43, 256, 999};
        int value = 32;
        int head = 0;
        int tail = arr.length - 1;
        boolean isFlag = true;
        while (head <= tail) {
            int mid = (head + tail) / 2;
            if (arr[mid] == value) {
                System.out.println("找到了；下标：" + mid);
                isFlag = false;
                break;
            } else if (arr[mid] > value) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        if (isFlag) {
            System.out.println("没找到");
        }
    }
}
