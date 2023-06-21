package com.canvs._abstract.template.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:34
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;
    @Override
    public double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public String toString(){
        return super.toString()+" 工资:"+earnings();
    }
}
