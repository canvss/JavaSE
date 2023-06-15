package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 19:24
 */
public class ArrayMaxIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};
        int temp = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp){
                temp = arr[i];
                index = i;
            }
        }
        System.out.println(temp + "\t" +index);
    }
}
