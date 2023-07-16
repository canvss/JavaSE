package com.canvs.filestream;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 16:29
 */
public class FileReaderTest {
    @Test
    public void test01() {
        File file = new File("hello_copy.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int data;
            while ((data = fr.read()) != -1) System.out.print((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test02() {
        File file = new File("hello_copy.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            char[] cbuf = new char[5];
            int len;
            //错误方式
            //while ((len=fr.read(cbuf)) != -1) System.out.print(new String(cbuf));
            while ((len = fr.read(cbuf)) != -1) System.out.print(new String(cbuf, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test03() {
        FileReader fr = null;
        try {
            fr = new FileReader("hello_copy.txt");
            char[] cbuf = new char[5];
            int len;
            //错误方式
            //while ((len=fr.read(cbuf)) != -1) System.out.print(new String(cbuf));
            while ((len = fr.read(cbuf)) != -1) System.out.print(new String(cbuf, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
