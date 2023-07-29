package com.canvs.grammar.var;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 17:54
 */
public class VarTest {
    @Test
    public void test01() {
        var list = new ArrayList<>();
        var set = new TreeSet<Integer>();

        for (var v : list) {
            System.out.println(v);
        }
        for (var i = 1; i < 10; i++) System.out.println(i);

        var iterator = set.iterator();
        HashMap<Integer,System> map = new HashMap<>();
        var entrySet = map.entrySet();
    }
    @Test
    public void test02(){
        var arr = new int[]{1,2,3,4,5};
//        var arr1 = {1,2,3,4};
    }
}
