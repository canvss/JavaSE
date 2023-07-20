package com.canvs.otherstream;

import org.junit.Test;

import java.io.*;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/20 20:04
 */
public class ScannerTest {
    @Test
    public void test01() {
        Scanner input = new Scanner(System.in);
        PrintStream ps = null;
        try {
            ps = new PrintStream("b.txt");
            String temp = input.nextLine();
            ps.write(temp.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) ps.close();
            input.close();
        }
    }
    @Test
    public void test02() throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("b.txt"));
        while (input.hasNextLine()) System.out.println(input.nextLine());
        input.close();
    }
}
