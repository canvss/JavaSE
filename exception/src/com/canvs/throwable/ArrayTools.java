package com.canvs.throwable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 21:42
 */
public class ArrayTools {
    public static int getElement(int [] arr,int index){
        return arr[index];
    }
    public static void main(String[] args) {
        //ArrayIndexOutOfBoundsException异常
        ArrayTools.getElement(new int[]{1,2,3,4},4);
    }
}
