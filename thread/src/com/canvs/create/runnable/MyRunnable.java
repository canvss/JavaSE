package com.canvs.create.runnable;

import java.util.TreeMap;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 10:22
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
class TestMyRunnable{
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.setName("线程1");
        Thread t2 = new Thread(r1,"线程2");
        t1.start();
        t2.start();
    }
}