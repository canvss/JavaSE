package com.canvs.stream;

import org.junit.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 16:50
 */
public class StreamOfNullableTest {
    @Test
    public void test01() {
//        Stream<Object> stream = Stream.of(null);    //NullPointerException
        Stream<String> strem = Stream.of("A", null);    //java9新特性
        strem.forEach(System.out::println);
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(null);
        System.out.println(list);
        System.out.println(list.stream().count());  //2
    }

    @Test
    public void test02() {
        Stream<Object> stream = Stream.ofNullable(null);
        System.out.println(stream.count());    //0
    }

    @Test
    public void test03() {
        //原来控制终止的方式
        Stream.iterate(1, i -> i + 1).limit(10).forEach(System.out::println);
        //现在的终止方法
        Stream.iterate(1, i -> i < 100, i -> i + 1).forEach(System.out::println);
    }
}
