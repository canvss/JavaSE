package com.canvs.createmore.threadpool;

import java.util.concurrent.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/28 20:08
 */
public class ThreadPoolTest {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        //设置线程池的属性
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        service1.setMaximumPoolSize(50);    //设置线程池中线程数的上限
        //2.执行指定的线程操作，需要提供实现Runnable接口或Callable接口实现类的对象
        service1.execute(new NumberThread1());  //使用于Runnable
        service1.execute(new NumberThread2());
        try {
            Future ft = service1.submit(new NumberThread3());
            System.out.println("总和为："+ft.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        service.shutdown();
    }
}

class NumberThread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread3 implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}