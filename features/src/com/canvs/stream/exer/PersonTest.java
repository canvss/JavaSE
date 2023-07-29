package com.canvs.stream.exer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 17:02
 */
public class PersonTest {
    public static void main(String[] args) {
        ArrayList<String> one = new ArrayList<>();
        one.add("高尔夫琳");
        one.add("张学友");
        one.add("刘德华");
        one.add("王菲");
        one.add("黎明");
        one.add("张国荣");
        one.add("陈奕迅");
        List<String> list = one.stream().filter(s -> s.length() == 3).limit(3).toList();
        System.out.println(list);
        ArrayList<String> two = new ArrayList<>();
        two.add("胡歌");
        two.add("薛之谦");
        two.add("张三丰");
        two.add("张靓颖");
        two.add("张二狗");
        two.add("张天爱");
        List<String> list1 = two.stream().filter(s -> s.startsWith("张")).skip(2).toList();
        System.out.println(list1);
        Stream.concat(one.stream(),two.stream()).map(Person::new).forEach(System.out::println);
    }
}
