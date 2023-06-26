package com.canvs.project.domain;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:28
 */
public class NoteBook implements Equipment {
    private String model;
    private double price;

    public NoteBook() {
    }

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
