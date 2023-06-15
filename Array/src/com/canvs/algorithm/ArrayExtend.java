package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 19:41
 * 数组扩容
 */
public class ArrayExtend {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] newArr = new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length+1] = 20;
        newArr[arr.length+2] = 30;
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
