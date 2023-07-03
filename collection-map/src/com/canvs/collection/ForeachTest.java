package com.canvs.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/3 21:57
 */
public class ForeachTest {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        coll.add(6);
        for (Object obj:coll) System.out.println(obj);
    }
    @Test
    public void test02(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        for (Object obj:coll){
            System.out.println(obj);
        }
    }
}
