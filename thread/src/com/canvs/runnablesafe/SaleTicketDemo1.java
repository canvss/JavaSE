package com.canvs.runnablesafe;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 13:47
 */
public class SaleTicketDemo1 {
    public static void main(String[] args) {
        TicketSaleRunnable ticket = new TicketSaleRunnable();
        new Thread(ticket,"窗口1").start();
        new Thread(ticket,"窗口2").start();
        new Thread(ticket,"窗口3").start();
    }

}
class TicketSaleRunnable implements Runnable{
    int ticket = 100;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                if (ticket <= 0){
                    throw new RuntimeException("票已卖完。");
                }
                System.out.println(Thread.currentThread().getName()+":"+ticket);
                ticket--;
            }
        }
    }
}