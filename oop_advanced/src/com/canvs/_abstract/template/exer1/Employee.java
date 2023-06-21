package com.canvs._abstract.template.exer1;

import java.awt.print.PrinterAbortException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 11:27
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate birthday;
    public abstract double earnings();
    public String toString(){
        return "姓名:"+getName()+" number:"+getNumber()+" birthday:"+getBirthday().toDateString();
    }

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
