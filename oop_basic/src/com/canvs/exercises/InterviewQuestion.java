package com.canvs.exercises;

import java.io.PrintStream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/15 16:52
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);    //需要在method方法被调用之后，仅打印出a=100，b=200，写出method方法。
        System.out.println(a);
        System.out.println(b);
    }
    public static void method(int a, int b) {
        System.out.println(a = 100);
        System.out.println(b = 200);
        System.exit(0);
    }
}
