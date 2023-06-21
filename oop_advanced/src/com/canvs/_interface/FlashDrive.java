package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 19:54
 */
public class FlashDrive implements USB{
    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘弹出");
    }
}
