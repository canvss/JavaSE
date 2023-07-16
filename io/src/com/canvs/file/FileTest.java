package com.canvs.file;

import org.junit.Test;

import java.io.File;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 13:24
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath()); //JavaSE/hello.txt
    }
    @Test
    public void test01(){
        File file = new File("hello.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath()); //JavaSE/io/hello.txt
    }
    @Test
    public void test02(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/io/","hello.txt");
        System.out.println(file.getName()); //hello.txt
    }
    @Test
    public void test03(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/io/");
        File file2 = new File(file,"hello.txt");
    }
    @Test
    public void test04(){
        File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/io/hello.txt");
        System.out.println("文件目录名称："+file.getName());
        System.out.println("文件目录构造路径："+file.getPath());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("文件目录的父目录："+file.getParent());
    }
    @Test
    public void test05(){
        File file = new File("hello.txt");
        System.out.println("文件目录名称："+file.getName());
        System.out.println("文件目录构造路径："+file.getPath());
        System.out.println("是否是文件："+file.isFile());
        System.out.println("文件目录的父目录："+file.getParent());
        System.out.println("文件目录的父目录："+file.getAbsoluteFile().getParent());
    }
}
