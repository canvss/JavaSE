package com.canvs.generic.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 15:48
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }

    @Override
    public int compareTo(MyDate o) {
        int year = this.year - o.year;
        if (year == 0) {
            int month = this.month - o.month;
            if (month == 0) {
                return this.day - o.day;
            }
            return month;
        }
        return year;
    }
}
