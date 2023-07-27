package com.canvs.lambda.function;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/27 20:37
 */
public class UseFunctionProgramming {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("helloworld");
            }
        }).run();
    }
}
