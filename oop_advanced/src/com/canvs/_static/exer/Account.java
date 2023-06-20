package com.canvs._static.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 13:38
 */
public class Account {
    private double balance;
    private int id;
    private static double annuallnterestRate;  //年利率
    private static double minBalance;
    private String password;
    private static int idInit=1000;
    public Account(){
        this.id = idInit++;
    }

    public Account(double balance, String password) {
        this();
        this.balance = balance;
        this.password = password;
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

    public static double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public static void setAnnuallnterestRate(double annuallnterestRate) {
        Account.annuallnterestRate = annuallnterestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getInfo(){
        return "id:"+getId()+" 余额："+getBalance()+" 年利率："+getAnnuallnterestRate()+" 密码："+getPassword();
    }
}
