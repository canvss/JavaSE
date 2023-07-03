package com.canvs.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/3 23:47
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("helo");
        list.add(2);
        list.add(3);
        list.add("java");
        list.add("python");
        list.remove(2);
        System.out.println(list);
//        list.remove(Integer.valueOf(2));
//        System.out.println(list);
    }
}
