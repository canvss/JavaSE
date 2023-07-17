package com.canvs.inputstreamreader;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.io.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/17 21:47
 */
public class InputStreamReaderTest {
    @Test
    public void test01() throws FileNotFoundException, UnsupportedEncodingException {
        FileInputStream fis = new FileInputStream(new File("hello.txt"));
        InputStreamReader isr = new InputStreamReader(fis);
        InputStreamReader isr1 = new InputStreamReader(fis,"utf-8");
    }
    @Test
    public void test02() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File
                    ("/Users/canvs/Desktop/JAVA/dbcp_gbk.txt"));
            InputStreamReader isr = new InputStreamReader(fis, "gbk");
            int len;
            while ((len = isr.read()) != -1) System.out.print((char) len);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
