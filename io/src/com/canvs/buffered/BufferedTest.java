package com.canvs.buffered;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 20:59
 */
public class BufferedTest {
    @Test
    public void test01() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("hello.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("hello.txt"));
        BufferedReader br = new BufferedReader(new FileReader("hello.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("hello.txt"));
    }
}
