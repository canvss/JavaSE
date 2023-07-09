package com.canvs.selfdefine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 22:12
 */
public class GenericMethodTest1 {
    public static <T> void arrayToCollection(T[] arr, Collection<T> c) {
        for (T a : arr) c.add(a);
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        String[] str = {"A","B","C","D"};
        GenericMethodTest1.arrayToCollection(str,list);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
