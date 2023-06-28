package com.canvs.single;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 16:15
 */
public class LazySingle {
    private LazySingle(){};
    private static class Inner{
        static final LazySingle INSTANCE = new LazySingle();
    }
    public static LazySingle getInstance(){
        return Inner.INSTANCE;
    }
}
class LazySingleTest{
    static LazySingle l1;
    static LazySingle l2;
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                l1 = LazySingle.getInstance();
            }
        };
        Thread t2 = new Thread(){
            @Override
            public void run() {
                l2 = LazySingle.getInstance();
            }
        };
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(l1==l2);
    }
}