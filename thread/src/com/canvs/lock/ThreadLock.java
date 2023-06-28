package com.canvs.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 23:08
 */
public class ThreadLock {
    public static void main(String[] args) {
        new Window2().start();
        new Window2().start();
    }
}
class Window2 extends Thread{
    static int ticket =100;
    static final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            try {
                lock.lock();
                if (ticket>0){
                    System.out.println(getName()+":"+ ticket--);
                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}