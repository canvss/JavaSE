package com.canvs._enum;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 12:58
 */
interface Info{
    void show();
}
public enum SeasonEnum1 implements Info{
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里?");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show() {
            System.out.println("宁静的夏天");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show() {
            System.out.println("秋天不回来");
        }
    },
    WINTER("动天","白雪皑皑"){
        @Override
        public void show() {
            System.out.println("2002年的第一场雪");
        }
    }
    ;
    private final String SEASON_NAME;
    private final String SEASON_DESC;
    private SeasonEnum1(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }
}

class Enum1Test{
    public static void main(String[] args) {
        SeasonEnum1 s = SeasonEnum1.AUTUMN;
        s.show();
    }
}