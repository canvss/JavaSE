package com.canvs.wrapper;

import com.canvs.Inner.InterviewQuestion;
import com.canvs.Inner.Outer3;
import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 20:12
 */
public class Wrapper {
    @Test
    public void test() {
        int i1 = 28;
        double d1 = 23.2;
        float f1 = 24.3f;
        Integer i2 = i1;
        Double d2 = new Double(d1);
        Float f2 = new Float(f1);
        int i = i2.intValue();
        double v = d2.doubleValue();
        float f = f2.floatValue();
    }

    @Test
    public void test2() {
        int i = 25;
        Integer i1 = i;
        double d = 3.5;
        Double d1 = d;
        Integer i2 = 3;
        int i3 = i2;
        Double d2 = 4.5;
        double d3 = i2;
    }

    @Test
    public void test3() {
        double pi = 3.14;
        String s = String.valueOf(pi);
        int i = 24;
        String s1 = String.valueOf(i);
        String s2 = i + "";
        String num = "3.14";
        double v = Double.parseDouble(num);
        int i3 = Integer.parseInt(s1);
        boolean b = false;
        String b2 = String.valueOf(b);
        System.out.println(b2);
        boolean b3 = Boolean.valueOf(b2);
        System.out.println(b3);
    }

    @Test
    public void test4() {
        String s = "1234";
        String s1 = "1.23";
        String s2 = "sunafa";
        int i = Integer.valueOf(s);
        double d = Double.valueOf(s1);
        Boolean b = Boolean.valueOf(s2);
    }

    @Test
    public void test5() {
        String s = "1234";
        String s1 = "1.23";
        String s2 = "sunafa";
        int i = new Integer(s);
        double d = new Double(s1);
        boolean b = new Boolean(s2);    //只要不是true转为boolean为flase
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }

    @Test
    public void test6() {
        Integer a = 1;  //直接用的缓冲的常量对象，在方法区
        Integer b = 1;
        System.out.println(a == b);   //true
        Integer c = 128;
        Integer d = 128;
        System.out.println(d == c); //false

        Integer e = new Integer(1);    //new的在堆中
        Integer g = new Integer(1);
        System.out.println(e == g); //false
        Boolean h = new Boolean(true);
        Boolean i = new Boolean(true);
        System.out.println(h == i);   //false
        Double j = new Double(1.0);
        Double k = new Double(1.0);
        System.out.println(j == k); //false
    }
    @Test
    public void test7(){
        Integer i = 1000;
        double j = 1000;
        System.out.println(i==j);   //true 会将i转换为int，然后自动类型转换规则，转为double
        int a = 1000;
        System.out.println(a == j); //会自动拆箱为int
    }
}
