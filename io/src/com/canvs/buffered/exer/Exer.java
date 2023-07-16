package com.canvs.buffered.exer;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/16 21:56
 */
public class Exer {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> map = new HashMap<>();
        File file = new File("IO/NameList.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String data;
        while ((data = br.readLine())!=null){
            String firstName = data.split(" ")[0];
            if (map.containsKey(firstName)){
                map.put(firstName,map.get(firstName)+1);
            }else{
                map.put(firstName,1);
            }
        }
        System.out.println(map);
        br.close();
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
