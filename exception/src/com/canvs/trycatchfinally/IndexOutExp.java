package com.canvs.trycatchfinally;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 23:19
 */
public class IndexOutExp {
    public static void main(String[] args) {
        int[] i = new int[]{1,2,3,4};
        try {
            for (int j = 0; j <=4 ; j++) {
                System.out.println(i[j]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界了");
        }
        System.out.println("执行完成");
    }
}
