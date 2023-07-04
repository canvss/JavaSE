package com.canvs.list;

import java.util.ArrayList;
import java.util.List;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 10:46
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }
    public static void updateList(List list){
        list.remove(2);
    }
}
