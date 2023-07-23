package com.canvs._class;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 18:00
 */
public class ClassLoaderTest {
    @Test
    public void test01() throws ClassNotFoundException {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println("系统默认类加载器：" + systemClassLoader);
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
        ClassLoader classLoader1 = Class.forName("java.lang.Object").getClassLoader();
        System.out.println("Object类加载器：" + classLoader1);
    }
    @Test
    public void test02() throws ClassNotFoundException {
        Class aClass = Class.forName("com.canvs._class.User");
        ClassLoader classLoader = aClass.getClassLoader();
        System.out.println("User类加载器：" + classLoader);
        ClassLoader parent = classLoader.getParent();
        System.out.println("User父类加载器:"+parent);
        System.out.println(parent.getParent()); //null
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println("String类的类加载器："+classLoader1);
        ClassLoader classLoader2 = Class.forName("sun.util.resources.cldr.zh.TimeZoneNames_zh").getClassLoader();
        System.out.println(classLoader2);
    }
}
