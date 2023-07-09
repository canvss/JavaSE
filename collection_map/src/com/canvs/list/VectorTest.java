package com.canvs.list;

import java.util.Vector;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 10:34
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement(Integer.valueOf(1));
        v.addElement(Integer.valueOf(2));
        v.addElement(Integer.valueOf(3));
        v.addElement("hello");
        System.out.println(v);
        v.insertElementAt("java", 1);
        v.setElementAt("world", 4);
        System.out.println(v);
        v.removeElement("java");
        System.out.println(v);
        v.removeAllElements();
        System.out.println(v);
    }
}
