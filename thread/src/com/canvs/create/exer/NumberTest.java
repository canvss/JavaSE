package com.canvs.create.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 10:51
 */
public class NumberTest {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <=100 ; i++) {
                    if (i %2 != 0){
                        System.out.println(getName()+":"+i);
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i < 101; i++) {
                    if (i % 2 == 0) {
                        System.out.println(getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
