package com.canvs.create.threadsafe;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 21:34
 */
public class TicketSaleThread extends Thread{
    private static int ticket = 100;
    public TicketSaleThread(String name){
        super(name);
    }
    @Override
    public void run() {
        while (ticket>0){
            try {
                salOneTicket();
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        }
    }
    public synchronized static void salOneTicket() throws InterruptedException {
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+": "+ticket);
            ticket--;
        }
    }
}

class SaleTicketDemo1{
    public static void main(String[] args) {
        new TicketSaleThread("窗口1").start();
        new TicketSaleThread("窗口2").start();
        new TicketSaleThread("窗口3").start();
    }
}