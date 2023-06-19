package com.canvs._equals;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 23:53
 */
public class UserTest {
    public static void main(String[] args) {
        User u1= new User("canvs","1234");
        User u2= new User("canvs","1234");
        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
    }
}
