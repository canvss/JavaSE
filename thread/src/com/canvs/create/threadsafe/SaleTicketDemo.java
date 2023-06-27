package com.canvs.create.threadsafe;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 13:34
 */
public class SaleTicketDemo {
    public static void main(String[] args) {
        new Window("窗口1").start();
        new Window("窗口2").start();
        new Window("窗口3").start();
    }
}
class Window extends Thread{
    private static int ticket=100;
    public Window(String name){
        super(name);
    }
    @Override
    public void run() {
        while (true){
            synchronized (Window.class){
                if (ticket<=0){
                    return;
                }
                System.out.println(getName()+":"+ticket);
                ticket--;
            }
        }
    }
}