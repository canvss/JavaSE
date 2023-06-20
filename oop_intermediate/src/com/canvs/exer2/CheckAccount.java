package com.canvs.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/18 00:24
 */
public class CheckAccount extends Account {
    private int overdraft;  //可透支额度

    public CheckAccount(double balance, int id, double annuallnterestRate, int overdraft) {
        super(balance, id, annuallnterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amt) {
        if (getBalance() >= amt) {
            super.withdraw(amt);
        } else if (getBalance()==0&&overdraft>=amt) {
            this.overdraft -=amt;
        } else if (getBalance() + overdraft >= amt) {
            this.overdraft -= amt - getBalance();
            super.withdraw(getBalance());
        } else {
            System.out.println("输入金额有误！");
        }
    }
    public String accountInfo() {
        return "id:" + getId() + "  余额:" + getBalance() + " 月利率:" + getMonthlyInterest() + " 额度:" + this.overdraft;
    }
}
