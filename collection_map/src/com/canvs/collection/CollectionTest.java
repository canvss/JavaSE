package com.canvs.collection;

import org.junit.Test;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/3 19:29
 */
public class CollectionTest {
    @Test
    public void test01(){
        Object[] obj = new Object[10];
        obj[0] = 123;
        obj[1] = "Java";
        obj[2] = Double.valueOf(4.5);
        System.out.println(Arrays.toString(obj));
    }
    @Test
    public void testAdd(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(Integer.valueOf(200));
        coll.add("java");
        coll.add(new Person("Tom",22));
        System.out.println(coll.size());
        System.out.println(coll);
    }
    @Test
    public void testAddAll(){
        Collection coll = new ArrayList();
        coll.add("java");
        coll.add("python");
        coll.add("c");
        coll.add("c++");
        System.out.println(coll);
        Collection list = new ArrayList();
        list.add("rust");
        list.add("golang");
        coll.addAll(list);
        System.out.println(coll);
        System.out.println(coll.size());
    }
    @Test
    public void test02(){
        Collection coll = new ArrayList();
        coll.add("java");
        coll.add("python");
        coll.add("c");
        coll.add(new Person("Tom",22));
        System.out.println(coll.isEmpty()); //false
        System.out.println(coll.size());    //4
        System.out.println(coll.contains("python"));    //true
        System.out.println(coll.contains(new Person("Tom",22)));    //true
        Collection coll1 = new ArrayList();
        coll1.add("python");
        coll1.add(new Person("Tom",22));
        System.out.println(coll.containsAll(coll1));    //true
        System.out.println(coll.equals(coll1)); //false
        Collection coll2 = new ArrayList();
        coll2.add("python");
        coll2.add(new Person("Tom",22));
        System.out.println(coll1.equals(coll2));    //true
    }
    @Test
    public void testRemove(){
        Collection coll = new ArrayList();
        coll.add("on java");
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        System.out.println(coll);
        coll.remove("on java");
        System.out.println(coll);
        System.out.println(coll.size());
    }
    @Test
    public void testRemoveAll(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        coll.add("on java");
        System.out.println(coll);
        Collection coll1 = new ArrayList();
        coll1.add("effective java");
        coll1.add("深入理解java虚拟机");
        coll.removeAll(coll1);  //会删除重复所有元素
        System.out.println(coll);   //[java编程思想, on java, on java]
    }
    @Test
    public void testReatainAll(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        coll.add("on java");
        System.out.println(coll);
        Collection coll1 = new ArrayList();
        coll1.add("effective java");
        coll1.add("深入理解java虚拟机");
        coll.retainAll(coll1);
        System.out.println(coll); //[深入理解java虚拟机, 深入理解java虚拟机, effective java]
        coll.clear();
        System.out.println(coll);   //[]
        System.out.println(coll.size());    //0
    }
    @Test
    public void testToArry(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        coll.add(new Person("Tom",23));
        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));
        String[] str = {"Tom","Jack","Canvs"};
        Collection coll1 = Arrays.asList(str);
        System.out.println(coll1);
    }
    @Test
    public void testIterator(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        coll.add(new Person("Tom",23));
        Iterator iterator = coll.iterator();    //获取迭代器对象
        //推荐写法
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void testOther(){
        Collection coll = new ArrayList();
        coll.add("java编程思想");
        coll.add("深入理解java虚拟机");
        coll.add("深入理解java虚拟机");
        coll.add("on java");
        coll.add("effective java");
        System.out.println(coll.hashCode());    //-1761129567
    }
}
