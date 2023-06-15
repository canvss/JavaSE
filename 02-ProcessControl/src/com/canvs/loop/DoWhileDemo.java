package com.canvs.loop;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        int num = (int)(Math.random()* 100);
        int count = 0;
        Scanner input = new Scanner(System.in);
        int tmp;
//        do {
//            System.out.print("请输入一个整数：");
//            tmp = input.nextInt();
//            if (num > tmp){
//                System.out.println("猜小了");
//            }else if (num < tmp){
//                System.out.println("猜大了");
//            }
//            count++;
//        }while (num != tmp);

        do {
            System.out.print("请输入一个整数：");
            tmp = input.nextInt();
            count++;
            if (num == tmp){
                System.out.println("猜对了");
                System.out.println("一共猜了"+count+"次");
                break;
            }else if (num < tmp){
                System.out.println("猜大了");
            }else {
                System.out.println("猜小了");
            }
        }while (true);
        input.close();
    }
}
