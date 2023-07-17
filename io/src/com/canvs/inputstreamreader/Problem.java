package com.canvs.inputstreamreader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/17 21:38
 */
public class Problem {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(new File("/Users/canvs/Desktop/JAVA/dbcp_gbk.txt"));
        int data;
        while ((data = fr.read())!=-1) System.out.print((char) data);
        fr.close();
    }
}
