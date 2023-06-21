package com.canvs._abstract.template.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:17
 */
public class CommonEmployee extends Employee{
    public CommonEmployee() {
    }

    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("id:"+this.getId()+" name:"+this.getName()+" salary:"+this.getSalary());
    }
}
