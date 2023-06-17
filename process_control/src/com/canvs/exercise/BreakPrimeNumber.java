package com.canvs.exercise;

import java.util.Scanner;

public class BreakPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = input.nextInt();
        boolean flag = true;
        for (int i = 2; num > 1 && i < num; i++) {
            if (num % i == 0) {
                flag = false;
                break;
            }
        }
        if (num > 1 && flag) {
            System.out.println(num + "是素数");
        } else {
            System.out.println(num + "不是素数");
        }
    }
}
