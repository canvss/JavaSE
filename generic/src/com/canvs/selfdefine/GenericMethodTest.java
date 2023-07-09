package com.canvs.selfdefine;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 22:01
 */
public class GenericMethodTest {
    public static <T> void test01(T t) {
    }

    public static <T> T test02() {
        return null;
    }

    public <T> T test03(T t) {
        return null;
    }
}
