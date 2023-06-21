package com.canvs._abstract.template.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:29
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toDateString() {
        return year + "年" + month + "月" + day + "日";
    }
}
