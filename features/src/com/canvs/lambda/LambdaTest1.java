package com.canvs.lambda;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/27 20:52
 */
public class LambdaTest1 {
    @Test
    public void test01(){
        //不使用Lambda表达式
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };
        run.run();  //hello world
        //使用Lambda表达式
        Runnable run2 = () -> {
            System.out.println("你好 世界");
        };
        run2.run(); //你好 世界
    }
    @Test
    public void test02(){
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("hello");
        Consumer<String> con2 = (String s) -> {
            System.out.println(s);
        };
        con2.accept("你好");
    }
    @Test
    public void test03(){
        Consumer<String> cons = (s) -> System.out.println(s);
        cons.accept("hello");
    }
    @Test
    public void test04(){
        Consumer<String> cons = s -> System.out.println(s);
        cons.accept("canvs");
    }

    @Test
    public void test05(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(com.compare(54, 24));
        Comparator<Integer> com2 = (o1,o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println(com2.compare(5, 24));
    }
    @Test
    public void test06(){
        Comparator<Integer> com = (o1,o2) -> o1.compareTo(o2);
        System.out.println(com.compare(16, 21));
    }
    @Test
    public void test07(){
        ArrayList<String> list = new ArrayList<>();
        int[] arr = {1,2,3};
    }
}
