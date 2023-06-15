package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 19:48
 * 数组缩容
 */
public class ArrayReduce {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int delIndex = 4;
//        第一种
//        for (int i = delIndex; i < arr.length-1; i++) {
//            arr[i] = arr[i+1];
//        }
//        arr[arr.length-1] = 0;
//        第二种
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (i == delIndex){
                continue;
            }
            if (i < delIndex){
                newArr[i] = arr[i];
            }else {
                newArr[i-1] = arr[i];
            }
        }
        arr = newArr;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
