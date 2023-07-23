package com.canvs.reflectapply.apply1;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 20:38
 */
public class CreateObjectTest {
    @Test
    public void test01() throws Exception {
        Class aClass = Class.forName("com.canvs.reflectapply.apply1.Person");
        Constructor<?> cons = aClass.getDeclaredConstructor();
        cons.setAccessible(true);
        Person person = (Person) cons.newInstance();
        System.out.println(person);
    }
    @Test
    public void test02() throws Exception {
        Class aClass = Class.forName("com.canvs.reflectapply.apply1.Person");
        Constructor<?> cons = aClass.getDeclaredConstructor(int.class, String.class);
        cons.setAccessible(true);
        Person person = (Person) cons.newInstance(10, "Jerry");
        System.out.println(person);
    }
}
