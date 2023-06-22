package com.canvs.junit;

import org.junit.Test;

import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 14:47
 */
public class JUnitTest {
    @Test
    public void method(){
        System.out.println("hello world");
        Scanner input = new Scanner(System.in);
        System.out.print("请输入：");
        String name = input.next();
        hello(name);
        input.close();
    }

    public void hello(String name){
        System.out.println("姓名："+name);
    }
}
