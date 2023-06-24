package com.canvs._throws;

import java.io.IOException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 20:24
 */
public class Fater {
    public void method() throws Exception {
        System.out.println("Fater.method");
    }
}
class Son extends Fater{
    @Override
    public void method() throws IOException {
        System.out.println("Son.method");
    }
}