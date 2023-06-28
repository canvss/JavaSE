package com.canvs.lifecycle;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 11:11
 */
public class TestThread {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(getName()+" 优先级："+getPriority()); //Thread-0 优先级：10
            }
        };
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
        System.out.println(Thread.currentThread().getName()+
                " 优先级："+Thread.currentThread().getPriority());  //main 优先级：5
    }
}
