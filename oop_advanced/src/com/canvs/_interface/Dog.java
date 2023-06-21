package com.canvs._interface;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 20:46
 */
public class Dog  implements Animal,Biological{
    @Override
    public void eat() {
        System.out.println("狗吭骨头");
    }

    @Override
    public void breathe() {
        System.out.println("小狗呼吸新鲜空气");
    }
}
