package com.canvs.overload;

import com.canvs.overload.ArrayUtil;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 20:50
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{-99, 6,-54, 7,-2, 0, 2, 33, 43, 256,-33, 999};
        System.out.println(util.info(arr));
//        util.bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(util.binarySearch(arr, 2));
//        util.reversely(arr);
//        System.out.println(Arrays.toString(arr));


        util.bubbleSort(arr,1);
        System.out.println(util.info(arr));
    }
}
