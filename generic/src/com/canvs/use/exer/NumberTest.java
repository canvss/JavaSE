package com.canvs.use.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.function.Predicate;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 15:17
 */
public class NumberTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(100));
        }
        for (Integer i : list) System.out.println(i);
//        使用迭代器删除
//        Iterator<Integer> it = list.iterator();
//        while (it.hasNext()){
//            Integer next = it.next();
//            if (next%2==0){
//                it.remove();
//            }
//        }
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });
        System.out.println();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
