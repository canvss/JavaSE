package com.canvs._this.exercises;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/17 13:39
 */
public class Bank {
    private Customer customer[];
    private int numberOfCustomer;

    public Bank() {
        this.customer = new Customer[10];
    }

    public void addCustomer(String firstName, String lastName) {
        if (numberOfCustomer < this.customer.length) {
            this.customer[numberOfCustomer++] = new Customer(firstName, lastName);
        } else {
            System.out.println("用户已满了");
        }
    }

    public int getNumberOfCustomer() {
        return this.numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            return null;
        }
        return this.customer[index];
    }
}
