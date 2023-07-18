package com.canvs.otherstream;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 22:58
 */
public class PrintStreamTest {
    @Test
    public void test01() {
        PrintStream ps = null;
        try {
            ps = new PrintStream("a.txt", "utf-8");
            ps.println("hello");
            ps.println("你好");
            ps.println(123);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
        }
    }

    @Test
    public void test02() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("a.txt");
        PrintStream ps = new PrintStream(fos, true);
        if (ps != null) System.setOut(ps);
        for (int i = 0; i < 255; i++) {
            System.out.println(i);
        }
        ps.close();
    }
}
