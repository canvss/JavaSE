package com.canvs.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/17 22:02
 */
public class OutputStreamWriterTest {
    @Test
    public void test01() throws UnsupportedEncodingException, FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(new File("a.txt"));
        OutputStreamWriter osw = new OutputStreamWriter(fos, "utf-8");
        OutputStreamWriter osw1 = new OutputStreamWriter(fos);
    }
    @Test
    public void test02() {
        OutputStreamWriter osw = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("a.txt"));
            osw = new OutputStreamWriter(fos, "utf-8");
            osw.write("hello");
            osw.write("你好！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
