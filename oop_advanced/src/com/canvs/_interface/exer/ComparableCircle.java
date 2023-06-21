package com.canvs._interface.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/21 22:43
 */
public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double redius) {
        super(redius);
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            return Double.compare(c.getRedius(),this.getRedius());
        }
        throw new RuntimeException("输入有误！");
    }
}
