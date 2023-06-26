package com.canvs.project.domain;

import com.canvs.project.service.Status;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:22
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status =Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.toString()+"\t"+"程序员\t"+status+"\t\t\t\t\t"+equipment.getDescription();
    }
    protected String getBasicDetailsForTeam(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() +
                "\t" + getSalary() + "\t";
    }
    public String getDetailsForTeam(){
        return getBasicDetailsForTeam() + "程序员";
    }
}
