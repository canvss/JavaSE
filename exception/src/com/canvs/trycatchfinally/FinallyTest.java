package com.canvs.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/23 23:50
 */
public class FinallyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        try {
            int i = input.nextInt();
            int c = i / 0;
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            System.out.println("分母不能为0");
        } finally {
            System.out.println("input.close()");
            input.close();
        }
    }
    @Test
    public void fileWrite() {
        FileInputStream input = null;
        try {
            File file = new File("/Users/canvs/Desktop/JAVA/JavaSE/exception/src/com/canvs/throwable/hello.txt");
            input = new FileInputStream(file);
            int b = input.read();
            while (b != -1) {
                System.out.println((char)b);
                b = input.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if(input != null) input.close();
                System.out.println("执行完毕，释放资源");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
