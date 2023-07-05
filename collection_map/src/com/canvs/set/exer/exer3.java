package com.canvs.set.exer;

import java.util.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 22:37
 */
public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一行字符串：");
        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        HashSet set = new HashSet();
        for (char c : arr) set.add(c);
        System.out.println(set);
        scanner.close();
    }
}
