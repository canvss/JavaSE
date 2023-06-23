package com.canvs.throwable;

import org.junit.Test;

import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 22:19
 */
public class RuntimeExceptionTest {
    @Test
    public void test1(){
        //ArrayIndexOutOfBoundsException
        int[] i = new int[]{1,2,3,4};
        System.out.println(i[4]);
    }
    @Test
    public void test2(){
        //ClassCastException
        Object obj = 15;
        String str = (String) obj;
        System.out.println(str);
    }
    @Test
    public void test3(){
        //NullPointerException
        int[][] i = new int[3][];
        System.out.println(i[2][1]);
    }
    @Test
    public void test4(){
        //InputMismatchException
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数：");   //输入字符串
        int i = input.nextInt();
        input.close();
    }
    @Test
    public void test5(){
        //ArithmeticException：
        int a = 10;
        System.out.println(a/0);
    }
}
