package com.canvs.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 00:19
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int i = 10;
            int c = i/0;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("程序执行完毕！");
        }
    }
}
