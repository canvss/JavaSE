package com.canvs.deadlock;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 17:28
 */
public class TestDeadLock {
    public static void main(String[] args) {
        Object goods = new Object();
        Object money = new Object();
        Owner owner =  new Owner(goods,money);
        Customer customer = new Customer(goods,money);
        new Thread(owner).start();
        new Thread(customer).start();
    }
}

class Owner implements Runnable{
    private Object goods;
    private Object money;
    public Owner(Object goods,Object money){
        super();
        this.goods = goods;
        this.money = money;
    }
    @Override
    public void run() {
        synchronized(goods){
            System.out.println("先给钱");
            synchronized (money){
                System.out.println("发货！");
            }
        }
    }
}
class Customer implements Runnable{
    private Object goods;
    private Object money;
    public Customer(Object goods,Object money){
        super();
        this.goods = goods;
        this.money = money;
    }

    @Override
    public void run() {
        synchronized(money){
            System.out.println("先发货");
            synchronized (goods){
                System.out.println("给钱");
            }
        }
    }
}