package com.canvs._static.singleton;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 22:28
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton(){

    }
    public static HungrySingleton getInstance() {
        return singleton;
    }
}
class HungrySingletonTest{
    public static void main(String[] args) {
        HungrySingleton s1 = HungrySingleton.getInstance();
        HungrySingleton s2 = HungrySingleton.getInstance();
        System.out.println(s1 == s2);   //true
    }
}