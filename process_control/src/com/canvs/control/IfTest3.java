package com.canvs.control;

import java.util.Scanner;

public class IfTest3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = input.nextInt();
        System.out.print("请输入月份：");
        int month = input.nextInt();
        if (year > 0){
            if (month > 0 && month <= 12){
                int days;
                if (month == 2){
                    if (year%4==0 && year%100!=0 || year%400==0){
                        days = 29;
                    }else{
                        days = 28;
                    }
                }else if (month==4 || month==6 || month==9 || month==11){
                    days = 30;
                }else {
                    days = 31;
                }
                System.out.println(year + "年" + month + "月有：" + days +"天");
            }else {
                System.out.println("月份输入不正确");
            }
        }else {
            System.out.println("年份输入不正确");
        }
        input.close();
    }
}
