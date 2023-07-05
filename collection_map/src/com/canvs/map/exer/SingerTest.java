package com.canvs.map.exer;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 15:15
 */
public class SingerTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        List list =new ArrayList();
        list.add("一千个伤心的理由");
        list.add("只想一生跟你走");
        list.add("遥远的她");
        list.add("她来听我的演唱会");
        map.put("张学友",list);
        List list2 = Arrays.asList("无条件","约定","单车");
        map.put("陈奕迅",list2);
        Set entrySet = map.entrySet();
        for (Object o : entrySet){
            Map.Entry m = (Map.Entry)o;
            System.out.println("歌手："+m.getKey());
            System.out.println("歌曲：" +m.getValue());
        }
    }
}
