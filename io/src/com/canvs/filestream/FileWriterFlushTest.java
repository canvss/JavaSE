package com.canvs.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 17:27
 */
public class FileWriterFlushTest {
    @Test
    public void test1() {
        FileWriter fw = null;
        try {
            fw = new FileWriter(new File("a.txt"));
            fw.write("Hello");
            fw.flush();
            fw.write("world");
            fw.flush();
            fw.write("!");
            fw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
