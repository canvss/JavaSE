package com.canvs.map;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/5 17:15
 */
public class User implements Comparable {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) return 0;
        if (o instanceof User) {
            User u = (User) o;
            if (this.age == u.age) return this.name.compareTo(u.name);
            return this.age - u.age;
        }
        throw new RuntimeException("类型错误！");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
