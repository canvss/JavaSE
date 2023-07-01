package com.canvs.math;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/2 00:19
 */
public class MathTest {
    @Test
    public void test01(){
        double d1 = Math.abs(-5);
        System.out.println(d1); //5.0
        System.out.println(Math.abs(5));    //5
    }
    @Test
    public void test02(){
        System.out.println(Math.ceil(3.3)); //4.0
        System.out.println(Math.ceil(-3.3)); //-3.0
        System.out.println(Math.ceil(5.1)); //6.0
    }
    @Test
    public  void test03(){
        System.out.println(Math.floor(3.3));    //3.0
        System.out.println(Math.floor(-3.3));   //-4.0
        System.out.println(Math.floor(5.1));    //5.0
    }
    @Test
    public void test04(){
        System.out.println(Math.round(5.5));    //6
        System.out.println(Math.round(5.4));    //5
        System.out.println(Math.round(-3.3));   //-3
        System.out.println(Math.round(-3.8));   // -4
    }
    @Test
    public void test05(){
        System.out.println(Math.pow(2,31)); //2.147483648E9
        System.out.println(Math.sqrt(256)); //16.0
        System.out.println(Math.random());
        System.out.println(Math.PI);
    }
}
