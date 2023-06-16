package com.canvs.constructor;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/16 17:28
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String fn, String ln) {
        firstName = fn;
        lastName = ln;
    }
    public String customerInfo(){
        return "姓名："+lastName+" "+firstName+"  账号："+account.getId()+
                "  余额："+account.getBalance()+"  年利率："
                +account.getAnnuallnterestRate()*100+"%";
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
