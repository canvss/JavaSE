package com.canvs.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 21:56
 */
public class HashSetTest {
    @Test
    public void test01(){
        Set set = new HashSet();
        set.add("深入Java虚拟机");
        set.add("算法第四版");
        set.add("Java编程思想");
        set.add("图解HTTP");
        set.add("鸟哥Linux私房菜");
        System.out.println(set);
        //set.add("鸟哥Linux私房菜");  //添加失败
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
    @Test
    public void test02(){
        Set set = new HashSet();
        set.add(new Book("深入Java虚拟机",98));
        set.add(new Book("算法第四版",79));
        set.add(new Book("Java编程思想",88.8));
        set.add(new Book("鸟哥Linux私房菜",56.4));
       // set.add(new Book("鸟哥Linux私房菜",56.4));   //添加失败
        System.out.println(set.size());
    }
    @Test
    public void test03(){
        Set set = new HashSet();
        set.add(new Book("深入Java虚拟机",98));
        set.add(new Book("算法第四版",79));
        set.add(new Book("Java编程思想",88.8));
        set.add(new Book("鸟哥Linux私房菜",56.4));
        set.remove(new Book("Java编程思想",88.8));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
