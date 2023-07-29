package com.canvs.reference;

import com.canvs.reference.data.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 10:13
 */
public class ConstructorRefTest {
    @Test
    public void test01() {
        //Supplier中的T get()
        Supplier<Employee> sup = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();
            }
        };
        //lambda表达式
        Supplier<Employee> sup1 = () -> new Employee();
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup1.get());
        System.out.println(sup2.get());
    }

    @Test
    public void test02() {
        //Function中的R apply(T t)
        Function<Integer, Employee> fun = id -> new Employee(id);
        System.out.println(fun.apply(1002));
        Function<Integer, Employee> fun2 = Employee::new;
        System.out.println(fun2.apply(1003));
    }

    @Test
    public void test03() {
        //BiFunction中的R apply(T t,U u)
        BiFunction<Integer, String, Employee> bf = (id, name) -> new Employee(id, name);
        System.out.println(bf.apply(1001, "Canvs"));
        BiFunction<Integer, String, Employee> bf1 = Employee::new;
        System.out.println(bf1.apply(1002, "Jack"));
    }

    @Test
    public void test04() {
        Function<Integer, String[]> fun = length -> new String[length];
        String[] str = fun.apply(6);
        System.out.println(str.length);
        Function<Integer,String[]> fun2 = String[]::new;
        System.out.println(fun2.apply(7).length);
    }
}
