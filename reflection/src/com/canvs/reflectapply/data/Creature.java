package com.canvs.reflectapply.data;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 20:55
 */
public class Creature <T>{
    boolean gender;
    public int id;
    public void breath(){
        System.out.println("呼吸");
    }
    private void info(){
        System.out.println("我是一个生物");
    }
}
