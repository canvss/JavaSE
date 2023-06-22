package com.canvs._enum;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 11:43
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SUMMER);
    }
}
class Season{
    private final String SEASONNAME;    //季节名称
    private final String SEASONDESC;    //季节描述
    private Season(String SEASONNAME,String SEASONDESC) {
        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "SEASONNAME='" + SEASONNAME + '\'' +
                ", SEASONDESC='" + SEASONDESC + '\'' +
                '}';
    }
}