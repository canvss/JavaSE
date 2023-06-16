package com.canvs.constructor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:22
 */
public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annuallnterestRate = a;
    }

    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("成功取款："+amount);
        } else {
            System.out.println("余额不足");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("成功存入：" + amount);
        }else {
            System.out.println("非法输入");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }
}
