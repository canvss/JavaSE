package com.canvs.reflectapply.apply2;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 22:37
 */
public class GenericTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("com.canvs.reflectapply.apply2.Son");
        Type type = clazz.getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) type;
        Type[] arguments = pt.getActualTypeArguments();
        System.out.println(Arrays.toString(arguments));
    }
}
class Father<T,U>{}
class Son extends Father<String,Integer>{}
