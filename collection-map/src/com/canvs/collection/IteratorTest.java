package com.canvs.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/3 21:45
 */
public class IteratorTest {
    @Test
    public void test01(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        coll.add(new Person("Tom",23));
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void testRemove(){
        Collection coll = new ArrayList();
        coll.add(1);
        coll.add(2);
        coll.add(3);
        coll.add(4);
        coll.add(5);
        coll.add(6);
        Iterator iterator = coll.iterator();
        while (iterator.hasNext()){
            //删除coll中的偶数
            if (0 == (((int) iterator.next()) % 2)) iterator.remove();
        }
        System.out.println(coll);
    }

    @Test
    public void testRemoveIf(){
        Collection coll = new ArrayList();
        coll.add(new Person("Tom",22));
        coll.add(new Person("jack",25));
        coll.add(new Person("lisa",22));
        coll.add(new Person("canvs",24));
        System.out.println(coll);
        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                Person p = (Person) o;
                return p.age==22;
            }
        });
        System.out.println(coll);
    }
}
