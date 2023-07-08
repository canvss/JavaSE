package com.canvs.collections;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/8 14:45
 */
public class NumberTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        Random r = new Random();
        while (set.size()<10){
            int temp = r.nextInt(50);
            set.add(temp);
        }
        List list = new ArrayList(set);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("升序："+list);
        Collections.sort(list,new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) return 0;
                return Integer.compare((Integer) o2, (Integer) o1);
            }
        });
        System.out.println("降序："+list);
    }
}
