package com.canvs.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 15:20
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        c1.start();
        c2.start();

    }
}
class Account{
    private double balance;

    public synchronized void deposit(double amt){
        if (amt>0){
            balance+=amt;
            System.out.println(Thread.currentThread().getName()+" 存钱成功:" +amt +" 余额:"+this.balance);
        }
    }
}
class Customer extends Thread{
    private Account account;

    public Customer(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.deposit(1000);
        }
    }
}