package com.canvs.other.dynamic;

import com.canvs.other.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 20:41
 */
public class ReflectionTest {
    public <T> T getInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getConstructor();
        return (T) constructor.newInstance();
    }
    @Test
    public void test() throws Exception {
        String className = "com.canvs.other.Person";
        Person p = getInstance(className);
        System.out.println(p.toString());
    }
    public <T> T invoke(String className,String methodName) throws Exception {
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getConstructor();
        Object o = constructor.newInstance();
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        return (T) showNation.invoke(o,"美国");
    }
    @Test
    public void test01() throws Exception {
        String className = "com.canvs.other.Person";
        String methodName = "showNation";
        String str = invoke(className, methodName);
        System.out.println(str);
    }
}
