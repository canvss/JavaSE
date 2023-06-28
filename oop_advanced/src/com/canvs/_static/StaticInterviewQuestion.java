package com.canvs._static;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 21:59
 */
public class StaticInterviewQuestion {
    public static void main(String[] args) {
        Demo d = new Demo();
        d = null;
        Demo c = null;
        d.hello();  //hello!
        c.hello();  //hello!
    }
}
class Demo{
    public static void hello(){
        System.out.println("hello!");
    }
}