package com.canvs.reference;

import com.canvs.reference.data.Employee;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 10:13
 */
public class MethodRefTest {
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
    public void consumerTest2() {
        List list = Arrays.asList("java", "c", "c++", "python", "c#");
        //lambda表达式
//        list.forEach(s -> System.out.println(s));
        //方法引用
        list.forEach(System.out::println);
    }

    @Test
    public void supplierTest() {
        Employee employee = new Employee(1002, "canvs", 21, 15000);
        Supplier<Employee> supplier = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return employee;
            }
        };
        System.out.println(supplier.get());
        //lambda表达式
        Supplier<Employee> supplier1 = () -> employee;
        System.out.println(supplier1.get());
        //方法引用
        Supplier<String> supplier2 = employee::getName;
        System.out.println(supplier2.get());
    }
    @Test
    public void functionTest(){
        Function<Double,Long> fun = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(fun.apply(15.69));   //16
        //lambda表达式
        Function<String,String> fun1 = (s) -> s.toUpperCase();
        System.out.println(fun1.apply("canvs"));
        //方法引用
        Function<String,String> fun2 = String :: toUpperCase;
        System.out.println(fun2.apply("java"));
    }
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
    @Test
    public void comparatorTest(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        //lambda表达式
        Comparator<Integer> com1 = (i1,i2) -> i1.compareTo(i2);
        System.out.println(com1.compare(25, 17));
        //方法引用
        Comparator<Integer> com2 = Integer::compareTo;
        System.out.println(com2.compare(14, 22));
    }
}
