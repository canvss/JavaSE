package com.canvs._throw;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/24 21:32
 */
public class MyException extends Exception{
    static final long serialVersionUID = -3387516323124229948L;
    public MyException(){}
    public MyException(String message){
        super(message);
    }
}
