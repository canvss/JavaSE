package com.canvs.project.domain;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:30
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
