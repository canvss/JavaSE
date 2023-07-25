package com.canvs.other.exer;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/25 21:02
 */
public class ReflectionTest {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
        properties.load(in);
        String className = (String) properties.get("fruitName");
        Class<?> clazz = Class.forName(className);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Fruit fruit = (Fruit) constructor.newInstance();
        Juicer juicer = new Juicer();
        juicer.run(fruit);
    }
}
