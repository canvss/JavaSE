package com.canvs.method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 21:55
 */
public class Rectangle {
    double length;
    double width;

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return (length+width)*2;
    }
    public String getInfo(){
        return "长="+length+"\t宽="+width+"\t面积="+area()+"\t周长="+perimeter();
    }
}
