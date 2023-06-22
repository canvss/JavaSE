package com.canvs.Inner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 11:32
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("hello world!");
            }
        }.test();
    }
}
