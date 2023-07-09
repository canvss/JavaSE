package com.canvs.list.exer2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 11:02
 */
public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        List list = new ArrayList();
        for (int i = 0; i < 30; i++) {
            list.add((char)(random.nextInt(26)+97));
        }
        System.out.println(list);
        System.out.println("a:"+countList(list,"a"));
        System.out.println("b:"+countList(list,"b"));
        System.out.println("c:"+countList(list,"c"));
        System.out.println("d:"+countList(list,"d"));
    }
    public static int countList(List list,String str){
        int count=0;
        for (Object obj : list) {
            if (str.equals(String.valueOf(obj))){
                count++;
            }
        }
        return count;
    }
}
