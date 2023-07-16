package com.canvs.buffered;

import org.junit.Test;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 21:38
 */
public class BufferedIOLineTest {
    @Test
    public void test01() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("hello.txt", true));
            bw.write("hello world");
            bw.newLine();
            bw.write("你好 世界");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test02() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("hello.txt"));
            System.out.println(br.readLine());  //hello world
            System.out.println(br.readLine()); //你好 世界
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test03() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("table.html"));
            String data;
            while ((data = br.readLine()) != null) System.out.println(data);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
