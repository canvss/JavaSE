package com.canvs.reflectapply.apply2;

import com.canvs.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 22:22
 */
public class OtherTest {
    @Test
    public void test01() throws Exception {
        Class<?> clazz = Class.forName("com.canvs.reflectapply.data.Person");
        //获取运行时的父类
        Class<?> superclass = clazz.getSuperclass();
        System.out.println(superclass.getName());
    }

    @Test
    public void test02() {
        Class<Person> personClass = Person.class;
        //获取运行时类实现的接口
        Class<?>[] interfaces = personClass.getInterfaces();
        for (Class c : interfaces) System.out.println(c.getName());
    }

    @Test
    public void test03() {
        Class<Person> personClass = Person.class;
        //获取运行时类所在的包
        Package aPackage = personClass.getPackage();
        System.out.println(aPackage.getName());
    }

    @Test
    public void test04() throws ClassNotFoundException {
        //获取运行时类的带泛型的父类
        Class<?> clazz = Class.forName("com.canvs.reflectapply.data.Person");
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    @Test
    public void test05() {
        Class<Person> clazz = Person.class;
        //获取带泛型的父类（Type是一个接口，Class实现了此接口
        Type genericSuperclass = clazz.getGenericSuperclass();
        //如果父类是带泛型的，则可以强转为ParameterizedType
        ParameterizedType genericSuperclass1 = (ParameterizedType) genericSuperclass;
        //调用getActualTypeArguments()获取泛型的参数，结果是一个数组，因为可能有多个泛型参数。
        Type[] actualTypeArguments = genericSuperclass1.getActualTypeArguments();
        System.out.println(((Class) actualTypeArguments[0]).getName());
    }
    @Test
    public void test06(){
        Class<?> clazz = Map.class;
        Class<?>[] declaredClasses = clazz.getDeclaredClasses();
        for (Class c: declaredClasses) System.out.println(c.getName());
        Class<Map.Entry> entryClass = Map.Entry.class;
        Class<?>declaredClass1 = entryClass.getDeclaringClass();
        System.out.println(declaredClass1);
    }
}
