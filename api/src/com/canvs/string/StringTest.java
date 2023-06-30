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
        System.out.println(s1 == s2);   //true
        s2 += "world";
        s1 = "helloworld";
        System.out.println(s1 == s2);  //false
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

    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = "hello" + "world";
        System.out.println(s3 == s4);   //false
        System.out.println(s3 == s5);   //false
        System.out.println(s3 == s6);   //true
    }

    @Test
    public void test06(){
        final String s1 = "hello";
        final String s2 = "world";
        String s3 = "helloworld";
        String s4 = s1 + "world";
        String s5 = s1 + s2;
        String s6 = "hello" + "world";
        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
    }

    @Test
    public void test07(){
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";

        String s4 = (s1 + "world").intern();//把拼接的结果放到常量池中
        String s5 = (s1 + s2).intern();

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//true
    }

    @Test
    public void test08(){
        String str = "hello";
        String str2 = "world";
        String str3 ="helloworld";
        String str4 = "hello".concat("world");  //返回值是new的在堆中
        String str5 = "hello"+"world";
        System.out.println(str3 == str4);//false
        System.out.println(str3 == str5);//true
    }
}
