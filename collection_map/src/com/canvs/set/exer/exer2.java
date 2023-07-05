package com.canvs.set.exer;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 22:27
 */
public class exer2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        Random random = new Random();
        while (set.size()<10){
            int i = random.nextInt(10)+1;
            set.add(i);
        }
        System.out.println(set);
    }
}
