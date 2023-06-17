package com.canvs._this.exercises;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 14:39
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("刘","备");
        bank.addCustomer("曹","操");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        System.out.println(bank.getCustomer(0).info());
        bank.getCustomer(0).getAccount().deposit(1000);
        System.out.println(bank.getCustomer(0).info());
        System.out.println("当前用户个数："+bank.getNumberOfCustomer());
    }
}
