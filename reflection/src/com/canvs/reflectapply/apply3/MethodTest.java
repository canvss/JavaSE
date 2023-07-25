package com.canvs.reflectapply.apply3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 19:58
 */
public class MethodTest {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = Student.class;
        Constructor<Student> constructor = clazz.getConstructor(String.class, int.class);
        constructor.setAccessible(true);
        Student tom = constructor.newInstance( "Tom", 12);
        Method toString = clazz.getDeclaredMethod("toString");
        String value = (String) toString.invoke(tom);
        System.out.println(value);
    }
}
