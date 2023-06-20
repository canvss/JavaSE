package com.canvs.block.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 23:29
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User("Canvs", "xjp@fuck");
        System.out.println(u1.getInfo());
        System.out.println(u2.getInfo());
    }
}
