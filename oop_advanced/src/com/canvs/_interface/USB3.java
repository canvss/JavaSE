package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 20:58
 */
public interface USB3{
    long MAX_SPEED = 500*1024*1024;
    void in();
    void out();
    static void show(){
        System.out.println("USB3.0快速传输");
    }
    default void method(){
        System.out.println("USB3默认方法");
    }
}
