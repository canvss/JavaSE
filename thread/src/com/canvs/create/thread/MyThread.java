package com.canvs.create.thread;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 10:13
 */
public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1;i <= 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
class TestMyThread{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        t1.start();
        MyThread t2 = new MyThread("线程2");
        t2.start();
    }
}
