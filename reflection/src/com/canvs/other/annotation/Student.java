package com.canvs.other.annotation;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 20:16
 */
@Table("t_stu")
public class Student {
    @Column(columnName = "sid",columnType = "int")
    private int id;
    @Column(columnName = "sname",columnType = "varchar(20)")
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
