package com.canvs.string.builder_buffer;

import org.junit.Test;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 22:57
 */
public class StringBuilderTest {
    @Test
    public void test01(){
        StringBuilder sb = new StringBuilder();
        sb.append("hello").append(true).append('a').append(123);
        System.out.println(sb); //hellotruea123
        System.out.println(sb.length());    //13
    }
    @Test
    public void test02(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.insert(5,"java");
        System.out.println(sb); //hellojavaworld
    }
    @Test
    public void test03(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.deleteCharAt(2);
        sb.delete(5,10);
        System.out.println(sb); //helow
    }
    @Test
    public void test04(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.reverse();
        System.out.println(sb); //dlrowolleh
    }
    @Test
    public void test05(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.setCharAt(2,'A');
        System.out.println(sb); //heAloworld
    }
    @Test
    public void test06(){
        StringBuilder sb = new StringBuilder("helloworld");
        sb.setLength(15);
        System.out.println(sb); //helloworld     
        System.out.println(sb.length());    //15
    }
}
