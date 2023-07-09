package com.canvs._equals;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/19 23:45
 */
public class User {
    private String name;
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof User){
            return this.name.equals(((User) obj).name)&&this.password.equals(((User) obj).password);
        }
        return false;
    }
}