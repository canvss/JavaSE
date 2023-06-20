package com.canvs._this.exercises;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 13:38
 */
public class Account {
    private double balance;


    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            this.balance += amt;
            System.out.println("存入成功：" + amt);
        } else {
            System.out.println("输入金额有误！");
        }
    }

    public void withdraw(double amt) {
        if (amt >= this.balance && amt > 0) {
            this.balance -= amt;
            System.out.println("取出成功：" + amt);
        } else {
            System.out.println("输入余额有误或余额不足！");
        }
    }
}
