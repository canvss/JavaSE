package com.canvs.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/18 00:34
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount ca = new CheckAccount(10000,1024,0.045,20000);
        System.out.println(ca.accountInfo());
        ca.withdraw(25000);
        System.out.println(ca.accountInfo());
        ca.withdraw(5000);
        System.out.println(ca.accountInfo());
    }
}
