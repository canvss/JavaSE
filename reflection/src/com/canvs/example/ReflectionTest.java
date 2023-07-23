package com.canvs.example;

import org.junit.Test;

import javax.naming.Name;
import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 16:10
 */
public class ReflectionTest {
    @Test
    public void test01() throws ClassNotFoundException {
        Class stringClass = String.class;
        System.out.println(stringClass);
        stringClass = "hello world".getClass();
        System.out.println(stringClass);
        Class personClass = Class.forName("com.canvs.example.Person");
        System.out.println(personClass);
        ClassLoader cl = this.getClass().getClassLoader();
        Class person = cl.loadClass("com.canvs.example.Person");
        System.out.println(person);
    }
    @Test
    public void test02() throws ClassNotFoundException {
        Class c1 = Person.class;
        Class c2 = new Person().getClass();
        Class c3 = Class.forName("com.canvs.example.Person");
        Class c4 = ClassLoader.getSystemClassLoader().loadClass("com.canvs.example.Person");
        System.out.println(c1 == c2);   //true
        System.out.println(c1 == c3);   //true
        System.out.println(c1 == c4);   //true
        System.out.println(this.getClass());
    }
    @Test
    public void test03(){
        System.out.println(Object.class);
        System.out.println(Comparable.class);
        System.out.println(String.class);
        System.out.println(int.class);
        System.out.println(ElementType.class);
        System.out.println(Override.class);
        System.out.println(int[][].class);
        System.out.println(void.class);
        System.out.println(Class.class);
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass()==b.getClass()); //true
    }
}
