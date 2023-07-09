package com.canvs.list;

import org.junit.Test;

import java.util.LinkedList;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 10:29
 */
public class LinkedListTest {
    @Test
    public void test01(){
        LinkedList list = new LinkedList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("深入理解java虚拟机");
        list.add("on java");
        list.add("effective java");
        System.out.println(list);
        list.addFirst("鸟哥Linux私房菜");
        list.addLast("Linux就该这么学");
        System.out.println(list);
    }
    @Test
    public void test02(){
        LinkedList list = new LinkedList();
        list.add("java编程思想");
        list.add("深入理解java虚拟机");
        list.add("深入理解java虚拟机");
        list.add("on java");
        list.add("effective java");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
