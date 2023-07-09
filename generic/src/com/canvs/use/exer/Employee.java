package com.canvs.use.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 15:47
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public MyDate getBirthday() {
        return birthday;
    }
}
