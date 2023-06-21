package com.canvs._abstract.template.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:18
 */
public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("id:"+this.getId()+" name:"+this.getName()+" salary:"+this.getSalary()+" bonus:"+this.bonus);
    }
}
