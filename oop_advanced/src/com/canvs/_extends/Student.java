package com.canvs._extends;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 21:09
 */
public class Student extends Person{
    private String scholl;

    public Student(String name) {
        this.setName(name);
    }

    public String getScholl() {
        return scholl;
    }

    public void setScholl(String scholl) {
        this.scholl = scholl;
    }
}
