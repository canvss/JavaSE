package com.canvs.map;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 14:28
 */
public class HashMapTest {
    @Test
    public void test01(){
        Map map = new HashMap();
        map.put("1001","Tom");
        map.put("1002","Jack");
        map.put("1003","Canvs");
        map.put("1004","Peter");
        map.put("1004","Canvs");
        map.put(null,null);
        HashMap map1 = new HashMap();
        map1.putAll(map);
        for (Object o:map1.keySet()){
            System.out.println(o+":"+map1.get(o));
        }
        map1.put("1001","Tom1");    //修改key对应的value
        map1.put(null,"hello");
        for (Object o: map1.entrySet()){
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey()+":"+m.getValue());
        }
    }
    @Test
    public void test02(){
        Map map = new HashMap();
        map.put("1001","Tom");
        map.put("1002","Jack");
        map.put("1003","Canvs");
        map.put("1004","Peter");
        System.out.println(map.size());
        System.out.println(map);
        map.remove("1003");
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());
    }
    @Test
    public void test03(){
        Map map = new HashMap();
        map.put("1001","Tom");
        map.put("1002","Jack");
        map.put("1003","Canvs");
        map.put("1005","Canvs");
        map.put("1004","Peter");
        System.out.println(map.get("1003"));
        System.out.println(map.containsKey("1004"));
        System.out.println(map.containsValue("Canvs"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        Map map2 = new HashMap();
        map2.put("1001","Tom");
        map2.put("1002","Jack");
        map2.put("1003","Canvs");
        map2.put("1005","Canvs");
        map2.put("1004","Peter");
        System.out.println(map.equals(map2));   //true
    }
    @Test
    public void test04(){
        Map map = new HashMap();
        map.put("1001","Tom");
        map.put("1002","Jack");
        map.put("1003","Canvs");
        map.put("1005","Canvs");
        map.put("1004","Peter");
        Set set = map.keySet();
        System.out.println(set);
        Collection values = map.values();
        for (Object o : values) System.out.println(o);
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey()+":"+m.getValue());
        }

    }
}
