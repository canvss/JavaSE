package com.canvs.file;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 14:08
 */
public class DirListFilesTest {
    @Test
    public void test01(){
        File file = new File("src/com/canvs/");
        for (File fl : file.listFiles()) System.out.println(fl.getName());
    }
    @Test
    public void test02(){
        File file = new File("src/com/canvs/");
        for (String fs : file.list()) System.out.println(fs);
    }
    @Test
    public void test03(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/README/imgs/");
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".jpg");
            }
        });
        for (File fs : files) System.out.println(fs.getName());
    }
    @Test
    public void test04(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/README/imgs/");
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });
        for (File fs : files) System.out.println(fs);
    }
}
