package com.canvs.create.thread;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 10:32
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 101; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}
