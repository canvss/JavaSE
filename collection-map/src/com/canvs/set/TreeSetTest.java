package com.canvs.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 23:18
 */
public class TreeSetTest {
    @Test
    public void test(){
        TreeSet set = new TreeSet();
        set.add(5);
        set.add(4);
        set.add(3);
        set.add(1);
        set.add(2);
       // set.add("123"); //ClassCastException异常
        System.out.println(set);
        System.out.println(set.first());
        System.out.println(set.last());
    }

    @Test
    public void test02(){
        //自然排序
        TreeSet set = new TreeSet();
        set.add(new Student("Tom",22));
        set.add(new Student("Jack",23));
        set.add(new Student("Lisa",22));
        set.add(new Student("Peter",25));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test03(){
        //定制排序
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1==o2) return 0;
                if (o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student) o1;
                    Student s2 = (Student) o2;
                    if (s1.getAge() == s2.getAge()) return s1.getName().compareTo(s2.getName());
                    return s1.getAge() - s2.getAge();
                }
                throw new RuntimeException("输入类型有误！");
            }
        });
        set.add(new Student("Tom",22));
        set.add(new Student("Peter",23));
        set.add(new Student("Lisa",22));
        set.add(new Student("Jack",23));
        for (Object obj : set) System.out.println(obj);
    }
}
