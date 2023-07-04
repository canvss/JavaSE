package com.canvs.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/4 22:50
 */
public class InterviewQuestion {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"A");
        Person p2 = new Person(1002,"B");
        set.add(p1);
        set.add(p2);
        p1.name = "C";
        set.remove(p1);
        System.out.println(set);
        set.add(new Person(1001,"C"));
        System.out.println(set);
        set.add(new Person(1001,"A"));
        System.out.println(set);
    }
}
class Person{
    int id;
    String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}