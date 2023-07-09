package com.canvs.set;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 23:26
 */
public class Student implements Comparable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof Student) {
            int value = this.name.compareTo(((Student) o).name);
            if (value == 0) return this.age - ((Student) o).age;
            return value;
        }
        throw new RuntimeException("类型有误！");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
