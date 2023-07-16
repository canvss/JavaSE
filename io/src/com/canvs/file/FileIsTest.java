package com.canvs.file;

import org.junit.Test;

import java.io.File;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 14:26
 */
public class FileIsTest {
    @Test
    public void test01(){
        String src = "hello.txt";
        String desc = "hello_copy.txt";
        File file = new File(src);
        file.renameTo(new File(desc));
    }
    @Test
    public void test02(){
        String desc = "hello_copy.txt";
        File file = new File(desc);
        System.out.println("文件目录是否存在"+file.exists());
        System.out.println("是否为文件："+file.isFile());
        System.out.println("是否为目录："+file.isDirectory());
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否隐藏："+file.isHidden());
    }
    @Test
    public void test03(){
        String desc = "src/com/canvs/";
        File file = new File(desc);
        System.out.println("文件目录是否存在："+file.exists());
        System.out.println("是否为文件："+file.isFile());
        System.out.println("是否为目录："+file.isDirectory());
        System.out.println("是否可读："+file.canRead());
        System.out.println("是否可写："+file.canWrite());
        System.out.println("是否隐藏："+file.isHidden());
    }
}
