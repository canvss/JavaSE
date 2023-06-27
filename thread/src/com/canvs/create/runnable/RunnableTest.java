package com.canvs.create.runnable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 10:34
 */
public class RunnableTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 101; i++) {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }).start();
    }
}
