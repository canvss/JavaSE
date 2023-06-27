package com.canvs.create.runnablesafe;

import sun.security.provider.ConfigFile;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 21:47
 */
public class SaleTicketDemo2 {
    public static void main(String[] args) {
        TicketSaleRunnable2 t2 = new TicketSaleRunnable2();
        new Thread(t2,"窗口1").start();
        new Thread(t2,"窗口2").start();
        new Thread(t2,"窗口3").start();
    }
}
class TicketSaleRunnable2 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (ticket>0){
            saleOneTicket();
        }
    }
    public synchronized void saleOneTicket(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+": "+ticket);
            ticket--;
        }
    }
}