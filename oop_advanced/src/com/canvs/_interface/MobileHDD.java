package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 21:55
 */
public class MobileHDD implements USB3{
    @Override
    public void in() {}
    @Override
    public void out() { }
}
class MobileHDDTest{
    public static void main(String[] args) {
        MobileHDD hdd = new MobileHDD();
        hdd.method();   //USB3默认方法
    }
}