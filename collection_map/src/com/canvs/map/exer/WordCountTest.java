package com.canvs.map.exer;

import java.util.HashMap;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 16:09
 */
public class WordCountTest {
    public static void main(String[] args) {
        String str = "aaaabbbcccccccccc";
        char[] arr = str.toCharArray();
        HashMap map = new HashMap();
        for (char c: arr){
            if (!map.containsKey(c)){
                map.put(c,1);
            }else map.put(c,(int)map.get(c)+1);
        }
        for (Object o: map.keySet()){
            System.out.println(o+":"+map.get(o));
        }
    }
}
