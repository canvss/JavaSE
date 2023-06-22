package com.canvs.Inner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 11:03
 */
public class Outer1 {
    public static void method(){
        System.out.println("外部类static方法");
        class Inner {
            final String c = "局部变量c";
            public void inMethon() {
                System.out.println("内部类的非静态方法");
                System.out.println(c);
            }
        }
        new Inner().inMethon();
    }
    public void method2(){
        class Inner{
            public void inMethod(){
                System.out.println("Inner.inMethod");
            }
        }
        new Inner().inMethod();
    }
    public static Runner getRunner(){
        class Inner implements Runner{
            @Override
            public void run() {
                System.out.println("Inner Runner.run");
            }
        }
        return new Inner();
    }
}
interface Runner{
    void run();
}
class Outer1Test{
    public static void main(String[] args) {
        Outer1.method();
        Outer1 outer = new Outer1();
        outer.method2();
        Outer1.getRunner().run();
    }
}