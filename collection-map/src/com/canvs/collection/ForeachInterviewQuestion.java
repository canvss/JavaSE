package com.canvs.collection;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/3 22:15
 */
public class ForeachInterviewQuestion {
    public static void main(String[] args) {
        String[] str = new String[5];
        for (String s : str){
            s = "hello";
            System.out.println(s);  //hello
        }
        for (String s : str) System.out.println(s); //null
    }
}
