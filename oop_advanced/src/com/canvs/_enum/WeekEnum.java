package com.canvs._enum;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 12:34
 */
public enum WeekEnum {
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    FRIDAY("星期五"),
    SATURDAY("星期六"),
    SUNDAY("星期天")
    ;
    private final String DESCRIPTION;
    WeekEnum(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }
}

class WeekEnumTest{
    public static void main(String[] args) {
        WeekEnum week = WeekEnum.SATURDAY;
        switch (week){
            case MONDAY:
                System.out.println(week.getDESCRIPTION()+" 怀恋周末");
                break;
            case TUESDAY:
                System.out.println(week.getDESCRIPTION()+" 进入工作状态");
                break;
            case WEDNESDAY:
                System.out.println(week.getDESCRIPTION()+" 坚持1");
                break;
            case THURSDAY:
                System.out.println(week.getDESCRIPTION()+" KFC疯狂星期四");
                break;
            case FRIDAY:
                System.out.println(week.getDESCRIPTION()+" 准备放假");
                break;
            case SATURDAY:
                System.out.println(week.getDESCRIPTION()+" 好好休息");
                break;
            case SUNDAY:
                System.out.println(week.getDESCRIPTION()+" 很烦，又要上班了");
                break;
        }
        System.out.println(week.name());    //SATURDAY
        System.out.println(week.ordinal()); //5
        WeekEnum[] we = WeekEnum.values();
        System.out.println(week.toString()); //SATURDAY
    }
}