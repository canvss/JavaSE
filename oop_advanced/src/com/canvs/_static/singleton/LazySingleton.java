package com.canvs._static.singleton;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 22:32
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {
    }
    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
class LazySingletonTest{
    public static void main(String[] args) {
        LazySingleton lz1 = LazySingleton.getInstance();
        LazySingleton lz2 = LazySingleton.getInstance();
        System.out.println(lz2 == lz1);
    }
}