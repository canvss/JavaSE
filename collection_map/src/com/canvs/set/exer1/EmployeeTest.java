package com.canvs.set.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 13:27
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //定制排序
        TreeSet set = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee){
                    Employee e1 = (Employee) o1;
                    Employee e2 = (Employee) o2;
                    return e1.getBirthday().compareTo(e2.getBirthday());
                }
                throw new RuntimeException("输入类型有误！");
            }
        });
        set.add(new Employee("Tom",21,new MyDate(2003,12,12)));
        set.add(new Employee("Jack",18,new MyDate(2005,1,15)));
        set.add(new Employee("Lisa",21,new MyDate(2003,5,25)));
        set.add(new Employee("Peter",28,new MyDate(1996,12,12)));
        set.add(new Employee("Canvs",24,new MyDate(2000,7,29)));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
    @Test
    public void test(){
        //自然排序
        TreeSet set = new TreeSet();
        set.add(new Employee("Tom",21,new MyDate(2003,12,12)));
        set.add(new Employee("Jack",18,new MyDate(2005,1,15)));
        set.add(new Employee("Lisa",21,new MyDate(2003,5,25)));
        set.add(new Employee("Peter",28,new MyDate(1996,12,12)));
        set.add(new Employee("Canvs",24,new MyDate(2000,7,29)));
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
