package com.canvs.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 17:17
 */
public class FileWriterTest {
    @Test
    public void test04() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("hello1.txt",true);
            fw.write("Hello World!");
            fw.write("你好");
            fw.write(123);
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test05() {
        File src = new File("hello_copy.txt");
        File desc = new File("hello.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader(src);
            fw = new FileWriter(desc);
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) fw.write(cbuf, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
