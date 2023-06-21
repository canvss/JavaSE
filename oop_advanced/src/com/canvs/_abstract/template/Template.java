package com.canvs._abstract.template;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 10:52
 */
public abstract class Template {
    public final void getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("执行的时间：" + (end - start) + "ms");
    }
    public abstract void code();
}
