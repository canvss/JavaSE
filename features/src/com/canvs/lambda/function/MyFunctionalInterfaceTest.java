package com.canvs.lambda.function;

import java.lang.reflect.Method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 10:06
 */
public class MyFunctionalInterfaceTest {
    public static void main(String[] args) {
        MyFunctionalInterface mfi = new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("hello");
            }
        };
        mfi.method();

        MyFunctionalInterface mfi1 = () -> System.out.println("你好");
        mfi1.method();
    }
}
