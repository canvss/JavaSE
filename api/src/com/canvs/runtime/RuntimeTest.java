package com.canvs.runtime;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/2 00:00
 */
public class RuntimeTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.totalMemory() / 1024 / 1024 + "MB");
        System.out.println(runtime.maxMemory()/1024/1024+"MB");
        String s = "";
        for (int i = 0; i < 10000; i++) {
            s += i;
        }
        System.out.println(runtime.freeMemory() / 1024 / 1024 + "MB");
    }
}
