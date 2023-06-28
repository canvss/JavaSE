package com.canvs.single;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 15:33
 */
public class HungrySingle {
    private HungrySingle() {};
    private static volatile HungrySingle INSTANCE = null;

    public static HungrySingle getInstancel() {
        if (INSTANCE == null) {
            synchronized (HungrySingle.class) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (INSTANCE == null) {
                    INSTANCE = new HungrySingle();
                }
            }
        }
        return INSTANCE;
    }
    public static synchronized HungrySingle getInstancel2(){
        if (INSTANCE==null) INSTANCE = new HungrySingle();
        return INSTANCE;
    }
    public static HungrySingle getInstancel3(){
        synchronized (HungrySingle.class){
            if (INSTANCE == null) INSTANCE = new HungrySingle();
            return INSTANCE;
        }
    }
}

class HungrySingleTest {
    static HungrySingle s1;
    static HungrySingle s2;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                s1 = HungrySingle.getInstancel3();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                s2 = HungrySingle.getInstancel3();
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

        System.out.println(s1 == s2);
    }
}