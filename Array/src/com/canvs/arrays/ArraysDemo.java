package com.canvs.arrays;

import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 13:21
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 6, 4, 9, 1, 3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);       //排序
        System.out.println(Arrays.toString(arr));
        int value = Arrays.binarySearch(arr, 9);    //二分查找返回下标
        System.out.println(value);
        int[] arr2 = new int[]{5, 7, 6, 4, 9, 1, 3};
        int[] arr3 = new int[]{5, 7, 6, 4, 9, 1, 3};
        System.out.println(arr2 == arr3);   //false
        System.out.println(Arrays.equals(arr3, arr2));  //true
        int[] arr4 = Arrays.copyOf(arr3, 5);
        int[] arr5 = Arrays.copyOf(arr3, 7);
        System.out.println(Arrays.toString(arr4));
        System.out.println(Arrays.toString(arr5));
        Arrays.fill(arr5,12);   //[12, 12, 12, 12, 12, 12, 12]将数组所有元素值替换为val
        System.out.println(Arrays.toString(arr5));

    }
}
