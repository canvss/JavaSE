package com.canvs.selfdefine;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 16:45
 */
public class Person <T>{
    T info;

    public Person(T info) {
        this.info = info;
    }
    public Person(){}

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
//    静态方法中不能声明泛型
//    public static void test(T t){
//    }
//    不能try...catch中定义泛型
//    public void test(){
//        try {
//
//        }catch (Exception<T> e){
//
//        }
//    }
}
