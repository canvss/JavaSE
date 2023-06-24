package com.canvs._throw;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 21:35
 */
public class MyExceptionTest {
    public static void main(String[] args) {
        MyExceptionTest test = new MyExceptionTest();
//        System.out.println(test.division(10, 0));
        System.out.println(test.division(10, 5));
    }
    public void judge(int num)throws MyException{
        if(num == 0){
            throw new MyException("分母不能为0");
        }
    }
    public int division(int i,int j){
        try {
            judge(j);
        }catch (MyException e){
            e.printStackTrace();
        }
        return i/j;
    }
}
