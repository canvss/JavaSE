package com.canvs.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/3 22:32
 */
public class ListTest {
    @Test
    public void testAdd(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        list.add(new Person("Tom",25));
        System.out.println(list);
    }
    @Test
    public void testAddAll(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        System.out.println(list);
        List list2 = new ArrayList();
        list2.add("鸟哥Linux私房菜");
        list2.add("鸟哥Linux私房菜");
        list2.add("JavaScript");
        list.addAll(list2);
        System.out.println(list);
    }
    @Test
    public void testGet(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        list.add(new Person("canvs",23));
        System.out.println(list.get(2));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    @Test
    public void testSubList(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        list.add(new Person("canvs",23));
        List list1 = list.subList(2,4); //[effective java, on java]
        System.out.println(list1);
    }
    @Test
    public void testIndexOf(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        list.add(new Person("canvs",23));
        System.out.println(list.indexOf("on java"));    //3
        System.out.println(list.indexOf(new Person("canvs",23)));//4
    }
    @Test
    public void testRemove(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        list.add(new Person("canvs",23));
        list.remove(2);
        list.remove("on java");
        System.out.println(list);
    }
    @Test
    public void testSet(){
        List list = new ArrayList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("effective java");
        list.add("on java");
        System.out.println(list);
        list.set(2,"鸟哥Linux私房菜");
        System.out.println(list);
    }
}
