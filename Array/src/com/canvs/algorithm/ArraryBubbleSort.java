package com.canvs.algorithm;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 21:34
 */
public class ArraryBubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,9,2,9,1};
        for (int i = 0; i < arr.length-1; i++) {        //一共n躺
            boolean exchange = true;    //无序
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchange = false;   //如果有交换表示数组是无序
                }
            }
            if (exchange){      //如果一趟没有交换说明数组是有序的
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +"\t");
        }
    }
}
