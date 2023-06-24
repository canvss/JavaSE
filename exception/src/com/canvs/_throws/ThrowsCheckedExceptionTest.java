package com.canvs._throws;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 20:09
 */
public class ThrowsCheckedExceptionTest {
    public static void main(String[] args) {
        try {
            getSleep();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("执行完毕！");
    }
    public static void getSleep() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("getSleep");
        }
    }
}
