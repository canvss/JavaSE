package com.canvs.string.builder_buffer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 22:30
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("我喜欢学习");
        sb.append(" JAVA");
        System.out.println(sb); //我喜欢学习 JAVA
    }
}
