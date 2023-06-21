package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 21:02
 */
public class TypeCConverter implements USBC{
    @Override
    public void charge() {
        System.out.println("可充电");
    }

    @Override
    public void in() {
        System.out.println("接收数据");
    }

    @Override
    public void out() {
        System.out.println("输出数据");
    }
    @Override
    public void reverse() {
        System.out.println("正反面都支持");
    }
}
