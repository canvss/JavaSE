package com.canvs.file.exer;

import java.io.File;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 14:59
 */
public class ListFilesTest {
    public static void main(String[] args) {
        String src = "/Users/canvs/Desktop/test/";
        printSubFile(new File(src));
        System.out.println(getDirectorySize(new File(src)));
        deleteDirctory(new File(src));
    }

    public static void printSubFile(File file) {
        if (file.isFile()) {
            System.out.println(file.getPath());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) for (File fs : files) printSubFile(fs);
        }
    }

    public static Long getDirectorySize(File file) {
        long size = 0;
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) for (File fs : files) size += getDirectorySize(fs);
        }else if (file.isFile()) size += file.length();
        return size;
    }

    public static void deleteDirctory(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) for (File fs : files) deleteDirctory(fs);
        }
        file.delete();
    }
}
