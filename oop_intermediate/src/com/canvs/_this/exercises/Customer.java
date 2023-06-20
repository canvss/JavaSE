package com.canvs._this.exercises;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 13:39
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer() {
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    public String info(){
        return "姓名："+this.firstName+this.lastName+"  余额："+this.account.getBalance();
    }
}
