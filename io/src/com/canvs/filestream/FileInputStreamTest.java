package com.canvs.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Calendar;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 17:51
 */
public class FileInputStreamTest {
    @Test
    public void test01() {
        File file = new File("hello.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] b = new byte[10];
            int len;
            while ((len = fis.read(b)) != -1) {
                System.out.print(new String(b, 0, len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void test02() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("hello.txt");
            int len;
            //读取到中文会乱码，读取中文使用read(byte[] b)
            while ((len = fis.read()) != -1) System.out.print((char) len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
