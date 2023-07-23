package com.canvs.reflectapply.apply2;

import com.canvs.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 20:54
 */
public class FieldsTest {
    @Test
    public void test01() throws Exception {
        Class aClass = Class.forName("com.canvs.reflectapply.data.Person");
        //获取到运行时类本身及其所有父类中声明为public修饰的属性
        Field[] fields1 = aClass.getFields();
        for (Field f : fields1) System.out.println(f.getName());
        System.out.println();
        //获取当前运行时类中声明的所有属性包括私有
        Field[] fields = aClass.getDeclaredFields();
        for (Field f : fields) System.out.println(f.getName());
    }

    @Test
    public void test02() {
        Class aClass = Person.class;
        Field[] fields = aClass.getDeclaredFields();
        for (Field f : fields) {
            //获取权限修饰符
            int modifier = f.getModifiers();
            System.out.print(modifier + ":" + Modifier.toString(modifier) + "\t");
            //数据类型
            Class<?> type = f.getType();
            System.out.print(type.getName()+"\t");
            //获取变量名
            String name = f.getName();
            System.out.print(name);
            System.out.println();
        }
    }
}
