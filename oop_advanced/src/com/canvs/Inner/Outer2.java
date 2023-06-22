package com.canvs.Inner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 11:17
 */
public class Outer2 {
    public void method(){
        System.out.println("Outer2");
    }
}
class Outer2Test{
    public static void main(String[] args) {
        new Outer2(){
            @Override
            public void method() {
                System.out.println("aaaa");
            }
        }.method();
    }
}