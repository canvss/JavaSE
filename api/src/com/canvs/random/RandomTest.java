package com.canvs.random;

import java.util.Random;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/2 00:28
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(11)); //0-11的随机数
    }
}
