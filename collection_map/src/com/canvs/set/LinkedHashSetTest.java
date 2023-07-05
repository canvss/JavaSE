package com.canvs.set;

import org.junit.Test;

import java.util.LinkedHashSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 23:01
 */
public class LinkedHashSetTest {
    @Test
    public void test01(){
        LinkedHashSet set = new LinkedHashSet();
        set.add("深入Java虚拟机");
        set.add("算法第四版");
        set.add("Java编程思想");
        set.add("图解HTTP");
        set.add("鸟哥Linux私房菜");
        System.out.println(set);
    }
}
