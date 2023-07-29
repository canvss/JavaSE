package com.canvs.grammar.record;

import java.util.HashSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 21:21
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("Tom");
        System.out.println(p);
        Person p2 = new Person("Jerry",12);
        System.out.println(p2.getNameInUpperCase());
        Person p3 = new Person("Jerry",12);
        HashSet<Person> set = new HashSet<>();
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        p.nation = "美国";
        System.out.println(p.getNation());

    }
}
