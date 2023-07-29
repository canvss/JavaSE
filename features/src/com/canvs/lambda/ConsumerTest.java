package com.canvs.lambda;

import com.canvs.reference.data.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 11:51
 */
public class ConsumerTest {
    @Test
    public void consumerTest() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        //lambda表达式
        Consumer<String> cons = (s) -> System.out.println(s);
        cons.accept("hello");
        //方法引用
        Consumer<String> cons1 = System.out::println;
        cons1.accept("你好");
    }
    @Test
    public void test01() {
        List<String> list = new ArrayList<>();
        list.add("canvs");
        list.add("tom");
        list.add("jerry");
        //lambda表达式
        list.forEach((s) -> System.out.println(s));
        //方法引用
        list.forEach(System.out::println);
    }

    @Test
    public void test02() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1001, "Canvs");
        map.put(1002, "Tom");
        map.put(1003, "Jerry");
        map.forEach((id, name) -> System.out.println("ID:" + id + " 姓名:" + name));
    }

    @Test
    public void biConsumerTest() {
        BiPredicate<String, String> biPred = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s, String s2) {
                return s.equals(s2);
            }
        };
        System.out.println(biPred.test("hello", "hello"));
        //lambda表达式
        BiPredicate<Employee, Employee> biPred1 = (e1, e2) -> e1.equals(e2);
        Employee tom = new Employee(1001, "Tom", 12, 7800);
        Employee jerry = new Employee(1002, "Jerry", 7, 8500);
        System.out.println(biPred1.test(tom, jerry));   //false
        //方法引用
        BiPredicate<String, String> bi = String::equals;
        System.out.println(bi.test(tom.getName(), jerry.getName()));
    }

    @Test
    public void objIntConsumerTest() {
        ObjIntConsumer<String> cons = new ObjIntConsumer<String>() {
            @Override
            public void accept(String s, int value) {
                System.out.println(Integer.parseInt(s) + value);
            }
        };
        cons.accept("100", 2);
        ObjIntConsumer<String> cons1 = (s, value) -> System.out.println(Integer.parseInt(s) + value);
        cons1.accept("100", 24);
    }
}
