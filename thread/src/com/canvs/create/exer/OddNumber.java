package com.canvs.create.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/27 10:54
 */
public class OddNumber extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=100 ; i++) {
            if (i %2 != 0){
                System.out.println(getName()+":"+i);
            }
        }
    }
}
