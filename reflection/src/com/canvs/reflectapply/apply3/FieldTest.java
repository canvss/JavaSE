package com.canvs.reflectapply.apply3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/24 21:20
 */
public class FieldTest {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.canvs.reflectapply.apply3.Student");
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        Constructor<?> constructor = clazz.getConstructor();
        Student stu = (Student) constructor.newInstance();
        name.set(stu,"Tom");
        System.out.println(stu);    //Student{name='Tom', age=0}
    }
}
