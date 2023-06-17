package com.canvs.overload;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 20:42
 */
public class ArrayUtil {
    public int binarySearch(int[] arr, int value){
        int head = 0;
        int end = arr.length-1;
        while (head <= end){
            int mid = (head+end)/2;
            if (arr[mid] == value){
                return mid;
            }else if(arr[mid]>value){
                end = mid -1;
            }else {
                head = mid +1;
            }

        }
        return -1;
    }
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    arrayValueSwap(arr,j);
                }
            }
        }
    }
    public void bubbleSort(int[] arr,int isFlag){
        if (0 < isFlag){    //正数升序，符数降序
            bubbleSort(arr);
        }else {
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = 0; j < arr.length-1-i; j++) {
                    if (arr[j]<arr[j+1]){
                       arrayValueSwap(arr,j);
                    }
                }
            }
        }
    }
    public void arrayValueSwap(int[] arr,int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public void reversely(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public String info(int[] arr){
        String info = "【";
        for (int i = 0; i < arr.length; i++) {
            String symbol = ", ";
            if(i==0){
                symbol = "";
            }
            info += symbol+arr[i];
        }
        return info+"】";
    }
}