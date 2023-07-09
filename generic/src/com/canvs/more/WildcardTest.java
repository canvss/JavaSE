package com.canvs.more;

import org.junit.Test;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 22:58
 */
public class WildcardTest {
    @Test
    public void test01() {
        Collection<?> coll = new ArrayList<String>();
//        coll.add(new Object())    //报错
        coll.add(null);
    }
    @Test
    public void test02(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Tom","Jack","Canvs"));
        show(list);
    }
    public static void show(Collection<?> coll){
        for (Object o : coll) System.out.println(o);
    }
    @Test
    public void test03(){
        List<?> list = null;
        list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
//        list.add(5); //编译不通过
        list.add(null);
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
    @Test
    public void test04(){
        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<>();
        l1.add("Tom");
        l1.add("Jack");
        l2.add(100);
        show1(l1);
        show1(l2);
    }
    public static void show1(List<?> list){
        for (Object o: list) System.out.println(o);
    }
}