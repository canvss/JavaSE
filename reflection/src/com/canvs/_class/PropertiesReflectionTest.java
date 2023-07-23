package com.canvs._class;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 20:24
 */
public class PropertiesReflectionTest {
    @Test
    public void test01() throws IOException {
        Properties properties = new Properties();
        InputStream in = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(in);
        String user = (String) properties.get("user");
        String password = (String) properties.get("password");
        System.out.println(user+" "+password);
    }
}
