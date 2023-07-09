package com.canvs.selfdefine;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 16:45
 */
public class Person <T>{
    T info;

    public Person(T info) {
        this.info = info;
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}
