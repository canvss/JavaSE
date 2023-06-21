package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 21:32
 */
public class PeripheralTest {
    public static void main(String[] args) {
      Computer1.useUSB(new Mouse());
      Computer1.useUSB(new Keyword());
    }
}
class Computer1{
    public static void useUSB(USB3 usb){
        usb.in();
        usb.out();
    }
}
class Mouse implements USB3{
    @Override
    public void in() {
        System.out.println("鼠标接收信号");
    }

    @Override
    public void out() {
        System.out.println("鼠标不接收信号");
    }
}
class Keyword implements USB3{
    @Override
    public void in() {
        System.out.println("键盘接收信号");
    }

    @Override
    public void out() {
        System.out.println("键盘不接收信号");
    }
}
