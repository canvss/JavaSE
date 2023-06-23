package com.canvs.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 22:30
 */
public class CheckedExceptionTest {
    @Test
    public void test() throws InterruptedException {
        //InterruptedException
        Thread.sleep(1000);
    }
    @Test
    public void test2() throws ClassNotFoundException {
        //ClassNotFoundException
        Class c = Class.forName("java.lang.String");
    }
    public void test3() throws SQLException {
        //SQLException
        Connection conn = DriverManager.getConnection("127.0.0.1");
    }

    @Test
    public void test4() throws IOException {
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/exception/src/com/canvs/throwable/hello.txt");
        //FileNotFoundException
        FileInputStream fis = new FileInputStream(file);
        //IOException
        int b = fis.read();
        while (b!=-1){
            System.out.print((char) b);
            b = fis.read();
        }
        fis.close();
    }
}
