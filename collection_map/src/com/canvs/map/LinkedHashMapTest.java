package com.canvs.map;

import org.junit.Test;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 16:33
 */
public class LinkedHashMapTest {
    @Test
    public void test01(){
        LinkedHashMap map = new LinkedHashMap();
        map.put("1001","Java编程思想");
        map.put("1002","深入理解Java虚拟机");
        map.put("1003","鸟哥Linux私房菜");
        map.put("1004","图解HTTP");
        map.put("1005","算法第四版");
        for (Object o: map.keySet()){
            System.out.println("编号："+o+" 书名："+map.get(o));
        }
    }
    @Test
    public void test02(){
        LinkedHashMap map = new LinkedHashMap();
        map.put("1001",new Book("Java编程思想",67.6));
        map.put("1002",new Book("深入理解Java虚拟机",99.8));
        map.put("1003",new Book("鸟哥Linux私房菜",78.5));
        map.put("1004",new Book("图解HTTP",49.9));
        map.put("1005",new Book("算法第四版",67));
        final Set entrySet = map.entrySet();
        for (Object o : entrySet){
            Map.Entry m = (Map.Entry) o;
            System.out.println("ID:"+m.getKey() +"  "+ m.getValue());
        }
    }
}
