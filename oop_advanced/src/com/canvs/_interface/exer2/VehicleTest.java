package com.canvs._interface.exer2;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/22 00:01
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer dev = new Developer("Canvs",22);
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bycicle("捷安特","red");
        vehicles[1] = new ElectricVehicle("雅迪","blue");
        vehicles[2] = new Car("迈巴赫","黑色","沪A8888");
        for (int i = 0; i < vehicles.length; i++) {
            dev.takingVehicle(vehicles[i]);
            if(vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
