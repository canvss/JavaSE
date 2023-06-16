package com.canvs.constructor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:12
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("tom");
        stu.setAge(23);
        Student stu2 = new Student("jerry",20);
        System.out.println(stu.studentInfo());  //姓名：tom  年龄：23
        System.out.println(stu2.studentInfo()); //姓名：jerry  年龄：20
    }
}
