package com.canvs.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 16:59
 */
public class RunnableLock {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w, "窗口1");
        Thread t2 = new Thread(w, "窗口2");
        t1.start();
        t2.start();
    }
}

class Window implements Runnable {
    int ticket = 100;
    private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ":" + ticket--);
                }else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}