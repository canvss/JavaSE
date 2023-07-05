package com.canvs.set.exer1;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 13:22
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof Employee) return this.name.compareTo(((Employee) o).name);
        throw new RuntimeException("类型有误！");
    }
}
