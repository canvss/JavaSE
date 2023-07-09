package com.canvs.wrapper;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 21:16
 */
public class TestExam {
    public static void main(String[] args) {
        int i =1;
        Integer j = new Integer(2);
        Circle c = new Circle();
        change(i,j,c);
        System.out.println(i);  //1
        System.out.println(j);  //2
        System.out.println(c.radius);   //10
    }
    public static void change(int a,Integer i,Circle c){
        a +=10;
        i+=10;
        c.radius += 10;
    }
}
class Circle{
    double radius;
}