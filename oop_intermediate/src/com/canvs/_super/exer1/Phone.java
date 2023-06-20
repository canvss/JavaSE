package com.canvs._super.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 22:34
 */
public class Phone {
    public void sendMessage(){
        System.out.println("发短信");
    }
    public void callUp(){
        System.out.println("打电话");
    }
    public void showNum(){
        System.out.println("来电号码");
    }
    public void callMe(){
        showNum();
    }
}
class Iphone extends Phone{
    @Override
    public void callUp() {
        System.out.println("视频通话");
    }

    @Override
    public void showNum() {
        super.showNum();
        System.out.println("来电用户头像");
    }
}