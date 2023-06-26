package com.canvs.project.service;

import com.canvs.project.domain.*;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 15:37
 */
public class NameListService {
    private Employee[] employees;
    public NameListService(){
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < Data.EMPLOYEES.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);
            double bonus;
            int stock;
            switch (type){
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case Data.PROGRAMMER:
                    employees[i] = new Programmer(id,name,age,salary,createEquipment(i));
                    break;
                case Data.DESIGNER:
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,createEquipment(i),bonus);
                    break;
                case Data.ARCHITECT:
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,createEquipment(i),bonus,stock);
                    break;
            }
        }
    }
    public Employee[] getAllEmployees(){
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if(id == employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }
    public Equipment createEquipment(int i){
        int equipmentType = Integer.parseInt(Data.EQUIPMENTS[i][0]);
        String nameOrModel = Data.EQUIPMENTS[i][1];
        String  priceOrDisplayOrType = Data.EQUIPMENTS[i][2];
        switch (equipmentType){
            case Data.NOTEBOOK:
                return new NoteBook(nameOrModel,Double.parseDouble(priceOrDisplayOrType));
            case Data.PC:
                return new PC(nameOrModel,priceOrDisplayOrType);
            case Data.PRINTER:
                return new Printer(nameOrModel,priceOrDisplayOrType);
        }
        return null;
    }
}
