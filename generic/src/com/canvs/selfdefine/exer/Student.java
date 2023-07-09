package com.canvs.selfdefine.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 20:44
 */
public class Student<T> {
    private String name;
    private T score;

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
