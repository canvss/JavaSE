package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 19:58
 */
public class Print implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}
