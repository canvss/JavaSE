package com.canvs.communication;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 17:55
 */
public class Communication implements Runnable {
    int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (i > 100) {
                    break;
                }
                System.out.println(Thread.currentThread().getName() + ":" + i++);
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class CommunicationTest {
    public static void main(String[] args) {
        Communication com = new Communication();
        Thread t1 = new Thread(com);
        Thread t2 = new Thread(com);
        t1.start();
        t2.start();
    }
}