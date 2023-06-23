package com.canvs.trycatchfinally;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 23:33
 */
public class InputMismatchExpTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数字：");
        try {
            int i = input.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        input.close();
    }
}
