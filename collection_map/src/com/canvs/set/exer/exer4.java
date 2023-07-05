package com.canvs.set.exer;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 12:58
 */
public class exer4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("B");
        list.add("D");
        list.add("A");
        list.add("C");
        System.out.println(list);
        System.out.println(sort(list));
    }

    public static List sort(List list) {
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                int num = s1.compareTo(s2);
                return num == 0 ? 1 : num;
            }
        });
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}
