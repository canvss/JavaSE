package com.canvs._throws;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 20:16
 */
public class ThrowsRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            Test(10);
        }catch (ArithmeticException e){
            System.out.println("分母为0"); //分母为0
        }finally {
            System.out.println("执行完毕！"); //执行完毕！
        }
    }
    public static int Test(int i) throws ArithmeticException{
        return i/0;
    }
}
