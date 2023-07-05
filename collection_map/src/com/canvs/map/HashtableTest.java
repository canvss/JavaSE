package com.canvs.map;

import org.junit.Test;

import java.util.Hashtable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 17:51
 */
public class HashtableTest {
    @Test
    public void test01(){
        Hashtable t = new Hashtable();
        t.put("1001","Tom");
        t.put("1002","Jack");
        t.put("1003","Lisa");
        //t.put(null,null);   //NullPointerException
        System.out.println(t);
        t.remove("1003");
        System.out.println(t);
        System.out.println(t.get("1001"));
    }
}
