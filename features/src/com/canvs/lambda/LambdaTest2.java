package com.canvs.lambda;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 11:44
 */
public class LambdaTest2 {
    public static void main(String[] args) {
        Call call = new Call() {
            @Override
            public void shout() {
                System.out.println("hello");
            }
        };
        callSomething(call);
        callSomething(()-> System.out.println("你好"));
    }
    public static void callSomething(Call call){
        call.shout();
    }
}
interface Call{
    void shout();
}
