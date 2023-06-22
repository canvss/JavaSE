package com.canvs._enum;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 12:11
 */
public enum Week {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
class WeekTest{
    public static void main(String[] args) {
        System.out.println(Week.SUNDAY);
        System.out.println(Week.valueOf("THURSDAY"));
        Week[] week = Week.values();
        for (int i = 0; i < week.length;i++) {
            System.out.println(week[i]);
        }
    }
}