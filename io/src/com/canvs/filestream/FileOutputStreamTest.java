package com.canvs.filestream;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 18:16
 */
public class FileOutputStreamTest {
    @Test
    public void test01() throws IOException {
        File file = new File("c.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.close();
    }

    @Test
    public void test02() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("a.txt", true);
            byte[] b = "hello".getBytes();
            fos.write(b, 0, 4);
            fos.write("world".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test03() {
        String src = "MyRunnable.java";
        String desc = "MyRunnable_copy.java";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(desc);
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) {
                fos.write(b, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
