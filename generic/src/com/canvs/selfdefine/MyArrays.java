package com.canvs.selfdefine;

import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 22:13
 */
public class MyArrays {
    public static <T> void sort(T[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean isFlag = true;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (((Comparable<T>)arr[j]).compareTo(arr[j+1])>0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isFlag = false;
                }
            }
            if (isFlag) break;
        }
    }
    public static void main(String[] args) {
        String[] str = {"D","A","C","B"};
        sort(str);
        System.out.println(Arrays.toString(str));
    }
}
