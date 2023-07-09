package com.canvs.list.exer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 10:50
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();
        while (true){
            System.out.print("选择（1.录入; 0.退出）：");
            int num = scan.nextInt();
            System.out.println();
            if (num == 1){
                System.out.print("姓名:");
                String name = scan.next();
                System.out.println();
                System.out.print("年龄:");
                int age = scan.nextInt();
                list.add(new Student(name,age));
            }else if (num == 0){
                break;
            }else{
                System.out.println("输入有误！");
            }
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        scan.close();
    }
}
