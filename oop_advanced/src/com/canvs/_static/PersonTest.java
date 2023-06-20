package com.canvs._static;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/20 21:41
 */
public class PersonTest {
    public static void main(String[] args) {
        Person.setNation("America") ;
        System.out.println(Person.getNation()); //America
        Student.setNation("Hongkong");
        System.out.println(Student.getNation());    //Hongkong
    }
}
class Student extends Person{

}