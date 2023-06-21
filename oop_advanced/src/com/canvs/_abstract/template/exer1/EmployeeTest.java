package com.canvs._abstract.template.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:49
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Canvs",1024,
                new MyDate(1999,6,2),100,150);
        System.out.println(emp1);
        Employee emp2 = new SalariedEmployee("Tom",1025,
                new MyDate(1997,5,3),20000);
        System.out.println(emp2);
    }
}
