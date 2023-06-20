package com.canvs._static.singleton;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 21:59
 */
public class StaticInterviewQuestion {
    public static void main(String[] args) {
        Demo d = null;
        System.out.println(d.getClass());
        d.hello();  //hello!
    }
}
class Demo{
    public static void hello(){
        System.out.println("hello!");
    }
}