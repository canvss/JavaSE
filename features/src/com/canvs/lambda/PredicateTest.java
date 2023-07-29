package com.canvs.lambda;

import com.canvs.reference.data.Employee;
import com.canvs.reference.data.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 12:39
 */
public class PredicateTest {
    @Test
    public void predicateTest(){
        List<String> list = Arrays.asList("a", "b", "c", "d");
        Predicate<List> predicate = new Predicate<List>() {
            @Override
            public boolean test(List list) {
                return list.size() >= 4;
            }
        };
        System.out.println(predicate.test(list));   //true

        Predicate<List> predicate1 = (list1) -> list.size()>=5;
        System.out.println(predicate1.test(list));  //false
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("yes");
        list.add("ok");
        list.forEach(System.out::println);
        System.out.println();
        list.removeIf(s -> s.length()<5);
        list.forEach(s-> System.out.println(s));
    }
}
