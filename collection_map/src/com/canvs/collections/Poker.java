package com.canvs.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 21:46
 */
public class Poker {
    public static void main(String[] args) {
        String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"♦️","♣️","♥️","♠️"};
        ArrayList poker = new ArrayList();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(color[i]+num[j]);
            }
        }
        poker.add("大王");
        poker.add("小王");
        Collections.shuffle(poker); //洗牌
        ArrayList Tom = new ArrayList();
        ArrayList Jerry = new ArrayList();
        ArrayList me = new ArrayList();
        ArrayList lastCards = new ArrayList();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size()-3){
                lastCards.add(poker.get(i));
            }else if (i%3==0){
                Tom.add(poker.get(i));
            }else if (i%3==1){
                Jerry.add(poker.get(i));
            }else{
                me.add(poker.get(i));
            }
        }
        System.out.println("Tom:"+Tom);
        System.out.println("Jerry:"+Jerry);
        System.out.println("我:"+me);
        System.out.println("底牌:"+lastCards);
    }
}
