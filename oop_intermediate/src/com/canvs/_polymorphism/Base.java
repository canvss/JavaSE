package com.canvs._polymorphism;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 22:06
 */
public class Base {
    int a = 1;

    public static void main(String[] args) {
        Base b = new Sub();
        System.out.println(b.a);
        Sub s = new Sub();
        System.out.println(s.a);
    }
}
class Sub extends Base{
    int a = 2;
}

