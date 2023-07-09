package com.canvs.set.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 13:25
 */
public class MyDate implements Comparable {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return getYear()+"年"+getMonth()+"月"+getDay()+"日";
    }
    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof MyDate){
            MyDate  date = (MyDate) o;
            int year = this.getYear() - date.getYear() ;
            if (year == 0){
                if (this.getMonth() == date.getMonth()){
                    return this.getDay() - date.getDay();
                }
                return this.getMonth() - date.getMonth();
            }
            return year;
        }
        throw new RuntimeException("输入类型有误！");
    }
}
