package com.canvs.trycatchfinally;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 23:29
 */
public class NullPointerExpTest {
    public static void main(String[] args) {
        Person p = new Person();
        p = null;
        try{
            System.out.println(p.name);
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

    }
}
class Person{
    public String name;
}