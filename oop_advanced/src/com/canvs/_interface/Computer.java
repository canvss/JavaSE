package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 19:51
 */
public class Computer{
    public static void useFlashDrive(USB usb){
        usb.start();
        System.out.println("USB设备工作中...");
        usb.stop();
    }
}

class ComputerTest{
    public static void main(String[] args) {
        Computer.useFlashDrive(new FlashDrive());
        Computer.useFlashDrive(new Print());
        Computer.useFlashDrive(new USB(){
            @Override
            public void start() {
                System.out.println("移动优盘开始工作");
            }
            public void stop(){
                System.out.println("移动优盘停止工作");
            }
        });
    }
}