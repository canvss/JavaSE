package com.canvs.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 17:00
 */
public class TreeMapTest {
    @Test
    public void test01() {
        TreeMap map = new TreeMap();
        map.put("D", "56");
        map.put("C", "45");
        map.put("M", "78");
        map.put("G", "89");
        map.put("J", "99");
        for (Object o : map.keySet()) {
            System.out.println(o + ":" + map.get(o));
        }
    }

    @Test
    public void test02() {
        //自然排序，年龄从小到大排序，年龄相同按照名字排序
        TreeMap map = new TreeMap();
        map.put(new User("Tom", 22), 90);
        map.put(new User("Jack", 27), 89);
        map.put(new User("Lisa", 18), 77);
        map.put(new User("Rose", 25), 65);
        map.put(new User("Canvs", 25), 89);
        Set entrySet = map.entrySet();
        for (Object o : entrySet) {
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + ":" + m.getValue());
        }
    }

    @Test
    public void test03() {
        //定制排序，按照姓名排序
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) return 0;
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    return u1.getName().compareTo(u2.getName());
                }
                throw new RuntimeException("输入类型有误！");
            }
        });
        map.put(new User("Tom", 22), 90);
        map.put(new User("Jack", 27), 89);
        map.put(new User("Lisa", 18), 77);
        map.put(new User("Rose", 25), 65);
        map.put(new User("Canvs", 25), 89);
        for (Object o:map.keySet()) System.out.println(o+":"+map.get(o));
    }
}
