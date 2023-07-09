package com.canvs.project.domain;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:20
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    protected String getDetails(){
        return id + "\t" + name + "\t" + age + "\t" + salary;
    }
    @Override
    public String toString() {
        return getDetails();
    }
}
