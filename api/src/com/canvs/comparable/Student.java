package com.canvs.comparable;

import java.util.Arrays;
import java.util.Objects;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/1 21:01
 */
public class Student implements Comparable {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof Student){
            return this.age - ((Student) o).age;
        }
        throw new RuntimeException("类型有误！");
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Student){
            Student stu = (Student) o;
            return stu.age==age&&stu.name.equals(name);
        }
        return false;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("jack",25);
        students[1] = new Student("Tom",12);
        students[2] = new Student("jerry",17);
        students[3] = new Student("lisa",30);
        students[4] = new Student("canvs",15);
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
