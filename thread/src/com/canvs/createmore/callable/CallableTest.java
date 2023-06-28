package com.canvs.createmore.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 22:46
 */
public class CallableTest {
    public static void main(String[] args) {
        NumThread t = new NumThread();
        FutureTask ft = new FutureTask(t);
        new Thread(ft).start();
        System.out.println(Thread.currentThread().getName()+":"+"hello!");
        try {
            Object sum = ft.get();
            System.out.println(sum);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+":"+"你好!");
//main:hello!
//5050
//main:你好!
    }
}
class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        Thread.sleep(1000*5);
        return sum;
    }
}
