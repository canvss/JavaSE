package com.canvs._static.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 22:15
 */
public class AccountTest {
    public static void main(String[] args) {
        Account.setAnnuallnterestRate(0.012);
        Account.setMinBalance(10);
        Account ac1 = new Account(2000,"123456");
        Account ac2 = new Account(3000,"123456");
        Account ac3 = new Account(4000,"123456");
        System.out.println(ac1.getInfo());
        System.out.println(ac2.getInfo());
        System.out.println(ac3.getInfo());
    }
}
