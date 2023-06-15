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
    //方法1
    public static void method(int a, int b) {
        System.out.println(a = 100);
        System.out.println(b = 200);
        System.exit(0);
    }
    //方法2
    public static void method2(int a, int b) {
        PrintStream ps = new PrintStream(System.out) {
            @Override
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);
    }
}
