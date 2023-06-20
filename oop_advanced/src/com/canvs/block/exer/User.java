package com.canvs.block.exer;

import java.util.Date;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 23:21
 */
public class User {
    private String username;
    private String password;
    private long registrationTime;

    public User() {
        this.username = registrationTime+"";
        this.password = "123456";
    }

    {
        this.registrationTime = System.currentTimeMillis();
    }

    public User(String username, String password) {
        this();
        this.username = username;
        this.password = password;
    }

    public String getInfo() {
        return "username:" + username + " password:" + password + " registrationTime:" + registrationTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsernam(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getRegistrationTime() {
        return registrationTime;
    }

}
