package com.canvs.throwable;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 00:10
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result); //0
    }
    public static int test(String str){
        try {
            Integer.parseInt(str);
            return 1;
        }catch (NumberFormatException e){
            return -1;
        }finally {
            return 0;
        }
    }
}
