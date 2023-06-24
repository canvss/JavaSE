package com.canvs._throw.exer;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 21:57
 */
public class NotTriangleException extends RuntimeException{
    static final long serialVersionUID = -7034892240745766939L;
    public NotTriangleException(){};
    public NotTriangleException(String message){
        super(message);
    }
}
