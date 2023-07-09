package com.canvs.generic.exer;

import org.junit.Test;
import sun.java2d.pipe.SpanIterator;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 15:50
 */
public class EmployeeTest {
    @Test
    public void test01() {
        TreeSet<Employee> set = new TreeSet<>();
        set.add(new Employee("Tom", 22, new MyDate(2000, 7, 25)));
        set.add(new Employee("Jack", 18, new MyDate(1997, 8, 26)));
        set.add(new Employee("Lisa", 19, new MyDate(1998, 5, 5)));
        set.add(new Employee("Jerry", 22, new MyDate(1997, 7, 16)));
        set.add(new Employee("Canvs", 18, new MyDate(2000, 8, 5)));
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }

    @Test
    public void test02() {
        //通过年龄排序
        TreeSet<Employee> set = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        set.add(new Employee("Tom", 22, new MyDate(2000, 7, 25)));
        set.add(new Employee("Jack", 18, new MyDate(1997, 8, 26)));
        set.add(new Employee("Lisa", 19, new MyDate(1998, 5, 5)));
        set.add(new Employee("Jerry", 22, new MyDate(1997, 7, 16)));
        set.add(new Employee("Canvs", 18, new MyDate(2000, 8, 5)));
        for (Employee e : set) System.out.println(e);
    }
}
