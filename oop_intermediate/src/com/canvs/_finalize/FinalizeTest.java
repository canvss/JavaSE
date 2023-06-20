package com.canvs._finalize;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 13:41
 */
public class FinalizeTest {
    public static void main(String[] args) {
        Person p = new Person("Tom",22);
        p = null;
        System.gc();    //被释放的对象Person{name='Tom', age=22}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
