package com.canvs._enum;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 12:20
 */
public enum SeasonEnum {
    SPRING("春天","春风又绿江南岸"),
    SUMMER("夏天","映日荷花别样红"),
    AUTUMN("秋天","秋水共长天一色"),
    WINTER("冬天","窗含西岭千秋雪")
    ;

    private final String SEASONNAME;
    private final String SEASONDESC;
    private SeasonEnum(String SEASONNAME, String SEASONDESC) {
        this.SEASONNAME = SEASONNAME;
        this.SEASONDESC = SEASONDESC;
    }

    public String getSEASONNAME() {
        return SEASONNAME;
    }

    public String getSEASONDESC() {
        return SEASONDESC;
    }

}
class SeasonEnumTest{
    public static void main(String[] args) {
        SeasonEnum[] season = SeasonEnum.values();
        for (int i = 0; i < season.length; i++) {
            System.out.println(season[i].name()+" "+season[i].getSEASONNAME()+" "+season[i].getSEASONDESC());
        }
    }
}