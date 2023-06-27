package com.canvs.create.lifecycle;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 11:17
 */
public class TestThreadStateChange {
    public static void main(String[] args) {
        Thread t = new Thread("线程1") {
            @Override
            public void run() {
                try {
                    for (int i = 1; i <= 100; i++) {
                        if (i % 2 == 0) {
                            System.out.println(getName() + ":" + i);
                        }
                        Thread.sleep(100);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t.start();
        new Thread("线程2") {
            @Override
            public void run() {
                int i = 1;
                while (i<101){
                    if (i%2 != 0){
                        System.out.println(getName() + ":" + i);
                    }
                    if (i==5){
                        try {
                           t.join();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    i++;
                }
            }
        }.start();
    }
}
