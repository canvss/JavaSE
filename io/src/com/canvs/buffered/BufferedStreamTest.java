package com.canvs.buffered;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 21:04
 */
public class BufferedStreamTest {
    public static void copyFileWithFileStream(File src,File desc) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(desc);
            byte[] b = new byte[1024];
            int len;
            while ((len = fis.read(b)) != -1) fos.write(b, 0, len);
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

    public static void copyFileWithBufferedStream(File src,File desc) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            bis = new BufferedInputStream(new FileInputStream(src));
            bos = new BufferedOutputStream(new FileOutputStream(desc));
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) bos.write(buffer, 0, len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bos != null) bos.close();
                if (bis != null) bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test1() {
        long start = System.currentTimeMillis();
        String src = "/Users/canvs/Desktop/Test/2-4.Djangocms实战-2.ts";
        String desc = "/Users/canvs/Desktop/Test/Djangocms实战-2.ts";
        copyFileWithFileStream(new File(src),new File(desc));
        long end = System.currentTimeMillis();
        System.out.println(end - start);      //1220
    }
    @Test
    public void test2(){
        long start = System.currentTimeMillis();
        String src = "/Users/canvs/Desktop/Test/2-4.Djangocms实战-2.ts";
        String desc = "/Users/canvs/Desktop/Test/Djangocms实战-2.ts";
        copyFileWithBufferedStream(new File(src),new File(desc));
        long end = System.currentTimeMillis();
        System.out.println(end - start);    //384
    }
}
