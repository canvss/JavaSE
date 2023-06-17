package com.canvs.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 13:38
 */
public class Account {
    private double balance;
    private int id;
    private double annuallnterestRate;  //年利率


    public Account(){

    }
    public Account(double balance, int id, double annuallnterestRate) {
        this.balance = balance;
        this.id = id;
        this.annuallnterestRate = annuallnterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
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
            System.out.println("取出成功，余额为：" + getBalance());
        } else {
            System.out.println("输入余额有误或余额不足！");
        }
    }

    public double getMonthlyInterest(){ //每月利率
        return this.annuallnterestRate / 12;
    }

}
