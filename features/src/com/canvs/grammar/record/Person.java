package com.canvs.grammar.record;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 21:17
 */
public record Person(String name,int age) {
    public static String nation;
    public static String getNation(){
        return nation;
    }
    public Person(String name){
        this(name,0);
    }
    public String getNameInUpperCase(){
        return name.toUpperCase();
    }
}
