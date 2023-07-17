package com.canvs.inputstreamreader.exer;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/17 22:22
 */
public class GBKToUTF8 {
    public static void main(String[] args) {
        String src = "/Users/canvs/Desktop/JAVA/dbcp_gbk.txt";
        String desc = "/Users/canvs/Desktop/JAVA/dbcp_utf8.txt";
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            FileInputStream fis = new FileInputStream(new File(src));
            FileOutputStream fos = new FileOutputStream(desc);
            isr = new InputStreamReader(fis, "GBK");
            osw = new OutputStreamWriter(fos, "utf-8");
            char[] buffer = new char[1024];
            int len;
            while ((len = isr.read(buffer)) != -1) osw.write(buffer, 0, len);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) osw.close();
                if (isr != null) isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test01() {
        InputStreamReader isr = null;
        try {
//            FileInputStream fis = new FileInputStream("/Users/canvs/Desktop/JAVA/dbcp_gbk.txt");
            FileInputStream fis = new FileInputStream("/Users/canvs/Desktop/JAVA/dbcp_utf8.txt");
            isr = new InputStreamReader(fis,"utf-8");
            char[] buffer = new char[1024];
            int len;
            while ((len = isr.read(buffer)) != -1) System.out.print(new String(buffer, 0, len));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (isr != null) isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
