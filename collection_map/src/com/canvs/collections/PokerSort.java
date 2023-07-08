package com.canvs.collections;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/8 15:18
 */
public class PokerSort {
    public static void main(String[] args) {
        String[] num = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        String[] color = {"♦️","♣️","♥️","♠️"};
        HashMap map = new HashMap();
        ArrayList list = new ArrayList();
        int index = 0;
        for (String s1 : num) {
            for (String s2 : color) {
                map.put(index, s2.concat(s1));
                list.add(index++);
            }
        }
        map.put(index++, "小王");
        list.add(index);
        map.put(index, "大王");
        list.add(index);
        Collections.shuffle(list);
        TreeSet tom = new TreeSet();
        TreeSet jerry = new TreeSet();
        TreeSet me = new TreeSet();
        TreeSet lastCards = new TreeSet();
        for (int i = 0; i < 54; i++) {
            if (i >= 51) {
                lastCards.add(list.get(i));
            } else if (i % 3 == 0) {
                tom.add(list.get(i));
            } else if (i % 3 == 1) {
                jerry.add(list.get(i));
            } else {
                me.add(list.get(i));
            }
        }
        show("Tom",map,tom);
        show("Jerry",map,jerry);
        show("Me",map,me);
        show("底牌",map,lastCards);
    }
    public static void show(String name,Map map,TreeSet set){
        System.out.print(name+":【");
        for (Object o : set){
            System.out.print(map.get(o)+" ");
        }
        System.out.println("】");
    }
}
