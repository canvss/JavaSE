package com.canvs._abstract.template;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 10:55
 */
public class SubTemplate extends Template{
    @Override
    public void code() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
    }
}
