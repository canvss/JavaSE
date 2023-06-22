package com.canvs.Inner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 11:23
 */
public interface Outer3 {
    void method();
}
class Outer3Test{
    public static void test(Outer3 out){
        out.method();
    }
    public static void main(String[] args) {
        Outer3 out = new Outer3(){
            @Override
            public void method() {
                System.out.println("bbbb");
            }
        };
        out.method(); //bbbb

        Outer3Test.test(new Outer3() {  //CCCCC
            @Override
            public void method() {
                System.out.println("CCCCC");
            }
        });
    }
}