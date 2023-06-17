package com.canvs.method;

import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 20:07
 */
public class UserInterface {
    public static void main(String[] args) {
        User u1 = new User();
        u1.username = "canvs";
        u1.password = "123456";
        Scanner input = new Scanner(System.in);
        System.out.print("用户名：");
        String inputName = input.next();
        System.out.print("密  码：");
        String inputPassword = input.next();
        if(u1.login(inputName,inputPassword)){
            System.out.println("login successfully");
        }else {
            System.out.println("login failure");
        }
    }
}
