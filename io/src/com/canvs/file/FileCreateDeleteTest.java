package com.canvs.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 14:38
 */
public class FileCreateDeleteTest {
    @Test
    public void test01() {
        File file = new File("/Users/canvs/Desktop/Test/hello.java");
        try {
            System.out.println(file.createNewFile() ? "创建成功！" : "创建失败！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test02() {
        File file = new File("/Users/canvs/Desktop/Test/hello/");
        System.out.println(file.mkdir() ? "创建成功！" : "创建失败！");
    }
    @Test
    public void test03(){
        File file = new File("/Users/canvs/Desktop/Test/hello1/test/");
        System.out.println(file.mkdirs() ? "创建成功！" : "创建失败！");
    }

    @Test
    public void test04(){
        File file = new File("/Users/canvs/Desktop/Test/","hello.java");
        System.out.println(file.delete()? "删除成功":"删除失败");
        File file2 = new File("/Users/canvs/Desktop/Test/","hello1/test/");
        System.out.println(file2.delete() ? "删除成功":"删除失败");
    }
}
