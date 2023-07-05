package com.canvs.set.exer;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 22:19
 */
public class exer1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        list.add(new Integer(4));
        list.add(new Integer(4));
        System.out.println(duplication(list));
    }

    public static List duplication(List list) {
        HashSet set = new HashSet();
        set.addAll(list);

        return new ArrayList(set);
    }
}
