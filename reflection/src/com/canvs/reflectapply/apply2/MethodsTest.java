package com.canvs.reflectapply.apply2;

import org.junit.Test;

import com.canvs.reflectapply.data.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/23 21:24
 */
public class MethodsTest {
    @Test
    public void test01() throws Exception {
        Class<?> aClass = Class.forName("com.canvs.reflectapply.data.Person");
        //获取到运行时类本身及其所有的父类中声明为public权限的方法
        Method[] methods1 = aClass.getMethods();
        System.out.println(Arrays.toString(methods1));
        System.out.println();
        //获取当前运行时类中声明的所有方法
        Method[] methods = aClass.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println(m);
        }
    }
    @Test
    public void test02() {
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods) {
            // 获取方法声明的注解
            Annotation[] annos = m.getAnnotations();
            for (Annotation a : annos) {
                System.out.print(a +" ");
            }
            //权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");
            //返回值类型
            System.out.print(m.getReturnType().getName() + "\t");
            //方法名
            System.out.print(m.getName());
            System.out.print(" (");
            //形参列表
            Class<?>[] parameterTypes = m.getParameterTypes();
            if (parameterTypes != null && parameterTypes.length != 0) {
                for (int i = 0; i < parameterTypes.length; i++) {
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + "args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + "args_" + i + ", ");
                }
            }
            System.out.print(" )");
            //抛出的异常
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length > 0){
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }
            System.out.println();
        }
    }
}
