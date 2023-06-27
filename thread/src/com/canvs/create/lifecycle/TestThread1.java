package com.canvs.create.lifecycle;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 12:08
 */
public class TestThread1 {
    public static void main(String[] args) {
        MyDaemo md = new MyDaemo();
        md.setDaemon(true);
        md.start();
        for (int i = 1; i < 101; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
class MyDaemo extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("守护线程");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}