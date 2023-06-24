package com.canvs._throw;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 21:49
 */
public class ReturnExceptionTest {
    public static void main(String[] args) {
        try {
            methodA();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        methodB();
    }
    static void methodA()throws RuntimeException{
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally {
            System.out.println("A的finally");
        }
    }
    static void methodB(){
        try {
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("B方法finally");
        }
    }
}

