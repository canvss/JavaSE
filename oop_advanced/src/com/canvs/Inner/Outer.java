package com.canvs.Inner;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 10:26
 */
public class Outer {
    private static String a = "外部类静态属性a";
    private static String b = "外部类非静态属性b";
    private String c = "外部类的非静态属性c";
    static class StaticInner{
        private static String a ="静态内部类的静态属性a";
        private String c = "静态内部类的非静态属性b";
        public static void show(){
            System.out.println(a);
            System.out.println(Outer.a);
            System.out.println(b);
        }
        public void show1(){
            System.out.println(a);
            System.out.println(this.c);
//            System.out.println(Outer.c); //静态内部类不能访问外部类的非静态成员
        }
    }
    class NoStaticInner{
        private String a = "内部类非静态属性a";
        private String c = "内部类非静态属性c";
        public void show(){
            System.out.println(a);
            System.out.println(c);
            System.out.println(Outer.a);
            System.out.println(Outer.this.c);   //调用外部类的非静态成员
            System.out.println(Outer.this.getClass());
        }
    }
    public NoStaticInner getInstance(){
        return new NoStaticInner();
    }
}
class OuterTest{
    public static void main(String[] args) {
        Outer.StaticInner inner = new Outer.StaticInner();
        Outer outer = new Outer();
        //通过方法获取非静态内部类的实例对象
        Outer.NoStaticInner inner1 = outer.getInstance();
        inner1.show();
        //通过外部类对象对非静态内部类实例化
        Outer.NoStaticInner inner2 = outer.new NoStaticInner();
        inner2.show();
    }
}