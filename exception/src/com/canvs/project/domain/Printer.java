package com.canvs.project.domain;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:32
 */
public class Printer implements Equipment{
    private String name;
    private String type;
    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }
    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
