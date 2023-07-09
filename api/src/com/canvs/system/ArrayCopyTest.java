package com.canvs.system;

import org.junit.Test;

import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/2 11:14
 */
public class ArrayCopyTest {
    @Test
    public void test1(){
        int[] i = {1,2,3,4,5,6,7,8,9};
        int[] j;
        j = Arrays.copyOf(i,i.length);  //使用Arrays.copyOf拷贝数组
        for (int value : j) {
            System.out.println(value);
        }
    }
    @Test
    public void test02(){
        int[] i = {1,2,3,4,5,6,7,8,9};
        int[] j = new int[i.length];
        System.arraycopy(i,0,j,0,i.length);
        for (int value : j) {
            System.out.println(value);
        }
    }
    @Test
    public void test03(){
        int[] i = {1,2,3,4,5,6,7,8,9};
        int[] y = new int[5];
        System.arraycopy(i,3,y,0,y.length); //指定位置到指定范围的拷贝
        for (int k = 0; k < y.length; k++) {
            System.out.println(y[k]);
        }
    }
    @Test
    public void test04(){
        int[] i = {1,2,3,4,5,6,7,8,9};
        System.arraycopy(i,2,i,1,5);    //删除第二个元素
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);
        }
    }
}
