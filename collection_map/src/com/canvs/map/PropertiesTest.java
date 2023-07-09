package com.canvs.map;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 17:59
 */
public class PropertiesTest {
    @Test
    public void test01() {
        Properties properties = System.getProperties();
        //当前源文件字符编码
        String property = properties.getProperty("file.encoding");
        System.out.println(property);   //UTF-8
    }

    @Test
    public void test02() {
        Properties properties = new Properties();
        properties.setProperty("user", "Canvs");
        properties.setProperty("password", "123456");
        System.out.println(properties);
    }

    @Test
    public void test03() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("/Users/canvs/Desktop/JAVA/JavaSE/collection_map/src/com/canvs/map/jdbc.properties"));
        String user = properties.getProperty("user");
        System.out.println(user);   //Canvs
    }
}
