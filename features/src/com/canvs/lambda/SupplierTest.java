package com.canvs.lambda;

import com.canvs.reference.data.Employee;
import org.junit.Test;

import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 12:00
 */
public class SupplierTest {
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
    }
    @Test
    public void booleanSupplier() {
        BooleanSupplier bs = () -> 1 > 5;
        System.out.println(bs.getAsBoolean());
    }
    @Test
    public void intSupplier(){
        IntSupplier is = () -> 1;
        System.out.println(is.getAsInt());
    }
    @Test
    public void test01(){
        Stream.generate(()->Math.PI).forEach((d)-> System.out.println(d));
    }
}
