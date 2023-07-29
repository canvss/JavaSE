package com.canvs.grammar.trycatch;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 17:25
 */
public class TryCatchTest {
    @Test
    public void test01() {
        OutputStreamWriter osw = null;
        FileOutputStream fos = null;
        try {
            File file = new File("hello.txt");
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos);
            osw.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (osw != null) osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test02() {
        try (
                FileWriter fw = new FileWriter("1.txt");
                BufferedWriter bw = new BufferedWriter(fw);
        ) {
            bw.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test03() {
        try (
                FileInputStream fis = new FileInputStream("d:/1.txt");
                InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
                BufferedReader br = new BufferedReader(isr);

                FileOutputStream fos = new FileOutputStream("1.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
                BufferedWriter bw = new BufferedWriter(osw);
        ) {
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test04() {
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter isw = new OutputStreamWriter(System.out);
        try (isr; isw) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
