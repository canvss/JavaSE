package com.canvs.generic;

import org.junit.Test;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 14:57
 */
public class CollectionMapGenericTest {
    @Test
    public void test01() {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add("五");
        int i = (int) list.get(4);  //ClassCastException
        System.out.println(i);
    }

    @Test
    public void test02() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add("五"); //编译不通过。
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
    @Test
    public void test03(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1001,"Tom");
        map.put(1002,"Jack");
        map.put(1003,"Jerry");
//        map.put("1004","Canvs");  //编译不通过
//        map.put(1005,'A');    //编译不通过
        Collection<String> coll = map.values();
        for (String s : coll) System.out.println(s);
    }
    @Test
    public void test04(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1001,"Tom");
        map.put(1002,"Jack");
        map.put(1003,"Jerry");
        Set<Integer> keySet = map.keySet();
        for (Integer i : keySet) System.out.println(i);
    }
    @Test
    public void test05(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1001,"Tom");
        map.put(1002,"Jack");
        map.put(1003,"Jerry");
        //遍历entry集
        Set<Map.Entry<Integer,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entrySet.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
