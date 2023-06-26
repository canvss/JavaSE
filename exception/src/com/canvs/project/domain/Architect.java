package com.canvs.project.domain;

import com.canvs.project.service.Status;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:35
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return super.getDetails()+"\t架构师\t"+super.getStatus()+"\t"+getBonus()+"\t"+stock+"\t"+getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam() +"架构师\t" + getBonus() + "\t" + getStock();
    }
}
