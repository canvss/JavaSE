package com.canvs.recursion;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/15 17:58
 */
public class RecursionSum {
    public static void main(String[] args) {
        RecursionSum re = new RecursionSum();
        System.out.println(re.getSum(100));
        System.out.println(re.multiply(5));
    }
    public int getSum(int num){
        if(num == 1){
            return 1;
        }
        return num+getSum(num-1);
    }
    public int multiply(int n){
        if(n == 1){
            return 1;
        }
        return n*multiply(n-1);
    }

}

