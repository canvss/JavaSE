package com.canvs.objectstream;

import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 20:03
 */
public class ObjectOutputStreamTest {
    @Test
    public void test01() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("objectStream.dat"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int a = 1024;
        oos.writeInt(a);
        oos.writeChar('A');
        oos.close();
    }
}
