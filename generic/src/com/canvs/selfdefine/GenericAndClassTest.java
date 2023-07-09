package com.canvs.selfdefine;

import java.util.List;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 22:44
 */
public class GenericAndClassTest {
    public static void main(String[] args) {
        Person[] persons = null;
        Man[] mans = null;
        Person p = mans[0];

        List<Person> personList = null;
        List<Man> manList = null;
//        personList = manList; //报错
    }
}
