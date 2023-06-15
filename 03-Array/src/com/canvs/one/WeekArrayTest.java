package com.canvs.one;

import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/13 18:44
 */
public class WeekArrayTest {
    public static void main(String[] args) {
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner input = new Scanner(System.in);
        System.out.print("请输入1-7的整数：");
        int day = input.nextInt();
        System.out.println(weeks[day - 1]);
        input.close();
    }
}
