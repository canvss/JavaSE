package com.canvs._main;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 21:13
 */
public class Hello {
    public static void main(String[] args) {
        Test.main(new String[]{"Tom","Jack","Jerry"});
    }
}
class Test{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }
}