package com.canvs.project.service;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 16:51
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3352211699324229948L;

    public TeamException() {
    }
    public TeamException(String message) {
        super(message);
    }
}
