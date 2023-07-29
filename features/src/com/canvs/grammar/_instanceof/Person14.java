package com.canvs.grammar._instanceof;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/29 18:04
 */
public class Person14 {
    private String name;
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person14 p){
            return this.name.equals(p.name);
        }
        return false;
    }
}
