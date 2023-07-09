package com.canvs.project.domain;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:34
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }
    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return super.getDetails()+"\t设计师\t"+super.getStatus()+"\t"+bonus+"\t\t\t"+getEquipment().getDescription();
    }
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam() +"设计师\t" + getBonus();
    }
}
