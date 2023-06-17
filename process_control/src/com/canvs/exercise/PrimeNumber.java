package com.canvs.exercise;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 13:25
 */
public class PrimeNumber {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 2; i <= 10000000; i++) {
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(count);
        System.out.println(end - start + "ms");
    }
}
