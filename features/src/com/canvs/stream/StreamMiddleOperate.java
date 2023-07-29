package com.canvs.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 15:31
 */
public class StreamMiddleOperate {
    @Test
    public void test01() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        //过滤出偶数
        Stream<Integer> stream1 = stream.filter(i -> i % 2 == 0);
        //终止操作
        stream1.forEach(System.out::println);
    }

    @Test
    public void test02() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(17, "canvs"));
        list.add(new Person(17, "canvs"));
        list.add(new Person(19, "tom"));
        Stream<Person> stream = list.stream();
        //过滤处姓名为canvs
        stream.filter(p -> p.getName().equals("canvs")).forEach(System.out::println);
    }

    @Test
    public void test03() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 3, 2, 2, 4, 5, 5, 4, 5, 6);
        //去除重复数据
        stream.distinct().forEach(System.out::println);
    }

    @Test
    public void test04() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(17, "canvs"));
        list.add(new Person(17, "canvs"));
        list.add(new Person(18, "tom"));
        list.add(new Person(19, "tom"));
        Stream<Person> stream = list.stream();
        stream.distinct().forEach(System.out::println);
        System.out.println();
        //不会修改原有数据
        list.forEach(System.out::println);
    }
    @Test
    public void test05(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 3, 2, 2, 4, 5, 5, 4, 5, 6);
        //第三个截断
        stream.distinct().limit(2).forEach(System.out::println);
    }
    @Test
    public void test06(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        stream.skip(4).forEach(System.out::println);
    }
    @Test
    public void test07(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 2, 2, 3, 3, 4, 4, 5);
        long count = stream.distinct().peek(System.out::println).count();
        System.out.println("count="+count);
    }
    @Test
    public void test08(){
        //找出前三个最大值，前三名最大的，不重复
        Stream<Integer> stream = Stream.of(11, 2, 39, 4, 54, 6, 2, 22, 3, 3, 4, 54, 54);
        stream.distinct().sorted((t1,t2) ->
                -Integer.compare(t1,t2)).limit(3)
                .forEach(System.out::println);
    }
    @Test
    public void test09(){
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.map(t-> t+1).forEach(System.out::println);
    }
    @Test
    public void test10(){
        Stream<String> stream = Stream.of("hello", "world", "tom", "jerry");
        stream.map(String::toUpperCase).forEach(System.out::println);
    }
    @Test
    public void test11(){
        Stream<String> stream = Stream.of("hello", "world", "tom", "jerry");
        stream.flatMap(t->Stream.of(t.split("|"))).forEach(System.out::println);
    }
}
