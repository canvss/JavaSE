package com.canvs._final;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 00:17
 */
public final class FinalTest {
    public static int totalNumber=5;
    public final int ID;
    public FinalTest(){
        ID = ++totalNumber;
    }

    public static void main(String[] args) {
        FinalTest ft = new FinalTest();
        System.out.println(ft.ID);
    }
}
