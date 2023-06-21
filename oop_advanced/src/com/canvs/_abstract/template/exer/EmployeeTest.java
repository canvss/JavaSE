package com.canvs._abstract.template.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:23
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Manager("Canvs",1024,19800,2000);
        Employee emp2 = new CommonEmployee("Tom",1027,5000);
        emp1.work();
        emp2.work();
    }
}
