package com.canvs.string;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 11:31
 */
public class StringTest {
    @Test
    public void test() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);   //true
    }

    @Test
    public void test2() {
        String s1 = new String("hello");
        String s2 = "hello";
        System.out.println(s1 == s2);   //false
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2); //true
        s2 += "world";
        s1 = "helloworld";
        System.out.println(s1 == s2); //false
    }

    @Test
    public void test4() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "hello" + "world";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = (s1 + s2).intern();
        System.out.println(s3 == s4);   //false
        System.out.println(s3 == s5);   //false
        System.out.println(s4 == s5);   //false
        System.out.println(s3 == s6);   //true

    }
}
