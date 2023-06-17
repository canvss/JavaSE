package com.canvs.constructor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:39
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Smith","jane");
        customer.setAccount(new Account(1024,2000,0.023));
        customer.getAccount().deposit(2000);    //成功存入：2000.0
        customer.getAccount().withdraw(500);    //成功取款：500.0
        customer.getAccount().withdraw(10000);  //余额不足
        System.out.println(customer.customerInfo());    //姓名：jane Smith  账号：1024  余额：3500.0  年利率：2.3%
    }
}
