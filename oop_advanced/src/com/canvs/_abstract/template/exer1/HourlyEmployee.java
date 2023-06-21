package com.canvs._abstract.template.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:39
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage*hour;
    }
    public String toString(){
        return super.toString()+" 工资:"+earnings();
    }
}
