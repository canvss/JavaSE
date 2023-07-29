package com.canvs.lambda;

import com.canvs.reference.data.Employee;
import org.junit.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.function.Function;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 12:28
 */
public class FunctionTest {
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
    public void test01(){
        HashMap<Integer,Employee> map = new HashMap<>();
        Employee e1 = new Employee(1, "张三", 8000);
        Employee e2 = new Employee(2, "李四", 9000);
        Employee e3 = new Employee(3, "王五", 10000);
        Employee e4 = new Employee(4, "赵六", 11000);
        Employee e5 = new Employee(5, "钱七", 12000);
        map.put(e1.getId(),e1);
        map.put(e2.getId(),e2);
        map.put(e3.getId(),e3);
        map.put(e4.getId(),e4);
        map.put(e5.getId(),e5);
//        map.forEach((k,v) -> System.out.println(k+":"+v));
        map.replaceAll((k,v)->{
            if (v.getSalary()<10000){
                v.setSalary(20000);
            }
            return v;
        });
        map.forEach((k,v) -> System.out.println(k+":"+v));
    }
}
