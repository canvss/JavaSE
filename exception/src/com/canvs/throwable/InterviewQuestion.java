package com.canvs.throwable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 00:14
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result); //100
    }
    public static int test(){
        int i = 100;
        try {
            return i;
        }finally {
            ++i;
        }
    }
}
