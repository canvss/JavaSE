package com.canvs.selfdefine.exer3;

import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 22:31
 */
public class GenericMethodExer {
    public static <E> void method1(E[] arr,int i,int j){
        E temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static <E> void method2(E[] arr){
        for (int i = 0,j = arr.length-1; i<j ; i++,j--) {
            E temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5,6,7};
        method2(arr);
        System.out.println(Arrays.toString(arr));
        method1(arr,3,6);
        System.out.println(Arrays.toString(arr));
    }
}
