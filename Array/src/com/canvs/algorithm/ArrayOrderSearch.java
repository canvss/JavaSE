package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 20:58
 * 顺序查找
 */
public class ArrayOrderSearch {
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,9};
        int value = 6;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]){
                index = i;
                break;
            }
        }
        if (index<0){
            System.out.println("没找到");
        }else {
            System.out.println("找到了:"+value + "下标："+ index);
        }
    }
}
