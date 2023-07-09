package com.canvs.selfdefine.exer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 20:47
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student<Double>("Tom",95.2));
        list.add(new Student<Double>("Jack",95.2));
        list.add(new Student<Character>("Canvs",'A'));
        list.add(new Student<String>("Jerry","优秀"));
        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
