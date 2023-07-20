package com.canvs.otherstream.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/20 20:12
 */
public class CommonsTest {
    @Test
    public void test01()throws IOException {
        IOUtils.copy(new FileInputStream("a.txt"),new FileOutputStream("c.txt"));
    }
    @Test
    public void test02() throws IOException, InterruptedException {
        FileUtils.copyDirectoryToDirectory(new File("/Users/canvs/Desktop/MySQL"),new File("/Users/canvs/Desktop/MySQL_123"));
        FileUtils.writeStringToFile(new File("b.txt"),"hello world!");
        System.out.println(FileUtils.readFileToString(new File("b.txt"), "utf-8"));
        FileUtils.copyFile(new File("a.txt"),new File("e.txt"));
    }
}
