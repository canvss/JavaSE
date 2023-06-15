package com.canvs.exercise;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        // 创建Scanner对象
        Scanner input = new Scanner(System.in);
        // 提示输入内容
        System.out.print("请输入用户名：");
        // 接收输入内容
        String name = input.next();
        System.out.print("请输入年龄：");
        int age = input.nextInt();
        System.out.println("用户名：" + name + "年龄：" + age);
        // 释放资源
        input.close();
    }
}
