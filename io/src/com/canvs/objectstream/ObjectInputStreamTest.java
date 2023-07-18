package com.canvs.objectstream;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 20:15
 */
public class ObjectInputStreamTest {
    @Test
    public void test01() throws IOException {
        FileInputStream fis = new FileInputStream("objectStream.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        int a = ois.readInt();
        System.out.println(a);
        char c = ois.readChar();
        System.out.println(c);
    }
}
