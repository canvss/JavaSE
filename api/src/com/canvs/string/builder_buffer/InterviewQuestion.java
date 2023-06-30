package com.canvs.string.builder_buffer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/30 23:15
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        String str = null;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        System.out.println(sb); //null
        System.out.println(sb.length());    //4
        StringBuilder sb2 = new StringBuilder(str); //NullPointerException
        System.out.println(sb2);
    }
}
