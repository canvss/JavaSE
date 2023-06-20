package com.canvs._super.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 23:19
 */
public class Test {
    public static void main(String[] args) {
        Son s = new Son("Canvs",22,1024);
        System.out.println(s.age);  //22
        System.out.println(s.getSuperAge());    //0
        System.out.println(s.getName());    //Canvs
    }
}
