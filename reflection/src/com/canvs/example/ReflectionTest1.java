package com.canvs.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 18:27
 */
public class ReflectionTest1 {
    @Test
    public void test01() throws Exception {
        Class aClass = Class.forName("com.canvs.example.Person");
        Person tom = (Person)aClass.newInstance();
        System.out.println(tom);
        System.out.println(aClass.getName());
        System.out.println(aClass.getSuperclass());
        Class[] interfaces = aClass.getInterfaces();
        for (Class c : interfaces) System.out.println(c.getName());
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println(classLoader);
        Constructor constructor = aClass.getConstructor();
        System.out.println(constructor);
        Constructor[] constructors = aClass.getConstructors();
        System.out.println(Arrays.toString(constructors));
    }
    @Test
    public void test02() throws Exception {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor();
        Field[] fields = personClass.getFields();
        System.out.println(Arrays.toString(fields));
        Field field = personClass.getField("name");
        Person person = constructor.newInstance(null);
        field.set(person,"Canvs");
        System.out.println(field.get(person));
        Field occupation = personClass.getField("occupation");
        System.out.println(occupation.get(null));
        Field score = personClass.getDeclaredField("score");
        score.setAccessible(true);
        System.out.println(score.get(null));
        Field gender = personClass.getDeclaredField("gender");
        gender.setAccessible(true);
        gender.set(person,'男');
        System.out.println(gender.get(person));
    }
    @Test
    public void test03() throws Exception {
        Class aClass = Class.forName("com.canvs.example.Person");
        Person tom = (Person) aClass.newInstance();
        Method info = aClass.getMethod("info", String.class);
        info.invoke(null,"男");
        Method toString = aClass.getMethod("toString");
        String value = (String) toString.invoke(tom);
        System.out.println(value);
        Constructor constructor = aClass.getDeclaredConstructor(char.class);
        constructor.setAccessible(true);
        Person p1 = (Person) constructor.newInstance('女');
        System.out.println(p1);
        Method show = aClass.getDeclaredMethod("show", String.class, int.class);
        show.setAccessible(true);
        show.invoke(null,"tom",22);
    }
}
