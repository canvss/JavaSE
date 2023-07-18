package com.canvs.otherstream;

import org.junit.Test;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 22:05
 */
public class OtherStreamTest {
    @Test
    public void test01() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String temp = null;
        try {
            while ((temp = br.readLine())!=null && !temp.equals("exit")) {
                System.out.println(temp.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
