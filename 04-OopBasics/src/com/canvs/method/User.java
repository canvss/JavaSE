package com.canvs.method;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/14 20:03
 */
public class User {
    String username;
    String password;

    public Boolean login(String inputName,String inputPassword){
        return username.equals(inputName) && password.equals(inputPassword);
    }
}
