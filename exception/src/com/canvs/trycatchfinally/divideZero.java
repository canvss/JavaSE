package com.canvs.trycatchfinally;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 23:25
 */
public class divideZero {
    public static void main(String[] args) {
        int i = 20;
        try {
            int a = 20/0;
            System.out.println("hello");    //不会执行
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("执行完成");
    }
}
