package com.canvs.file;

import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 13:55
 */
public class FileInfoMethodTest {
    @Test
    public void test01(){
        File file = new File("hello.txt");
        System.out.println("文件名："+file.getName());
        System.out.println("文件路父目录："+file.getParent());
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件路径："+file.getAbsoluteFile().getAbsolutePath());
        System.out.println("文件长度："+file.length());
        System.out.println("最近修改时间："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
    }
    @Test
    public void test02(){
        File file = new File("src");
        System.out.println("文件名："+file.getName());
        System.out.println("文件路父目录："+file.getParent());
        System.out.println("文件路径："+file.getAbsolutePath());
        System.out.println("文件路径："+file.getAbsoluteFile().getAbsolutePath());
        System.out.println("文件长度："+file.length());
        System.out.println("最近修改时间："+ new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(file.lastModified())));
    }
}
