package com.canvs.threadsafe;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 21:56
 */
public class SaleTicketDemo3 {
    public static void main(String[] args) {
        Ticket t = new Ticket();
        new Thread("窗口1"){
            @Override
            public void run() {
                while (true){
                    synchronized (t) {
                        t.sale();
                    }
                }
            }
        }.start();
        new Thread("窗口2"){
            @Override
            public void run() {
                while (true){
                    synchronized (t){
                        t.sale();
                    }
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    synchronized (t){
                        t.sale();
                    }
                }
            }
        },"窗口3").start();
    }
}
class Ticket{
    private int ticket = 100;
    public void sale(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+":"+ticket);
            ticket--;
        }else {
            throw new RuntimeException("没票了");
        }
    }
}
