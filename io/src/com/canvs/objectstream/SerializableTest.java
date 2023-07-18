package com.canvs.objectstream;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/18 20:44
 */
public class SerializableTest {
    @Test
    public void test01() throws IOException {
        FileOutputStream fos = new FileOutputStream(new File("a.dat"));
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeUTF("canvs");
        oos.writeInt(22);
        oos.writeBoolean(true);
        oos.writeFloat(9800.4f);
        oos.writeDouble(78.3);
        oos.close();
    }

    @Test
    public void test02() throws IOException {
        FileInputStream fis = new FileInputStream("a.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String name = ois.readUTF();
        int age = ois.readInt();
        boolean gender = ois.readBoolean();
        float salary = ois.readFloat();
        double bonus = ois.readDouble();
        System.out.println("姓名：" + name + " 年龄：" + age + " 性别：" + (gender ? '男' : '女') + " 工资：" + salary + " 奖金：" + bonus);
        ois.close();
    }

    @Test
    public void test03() {
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fs = new FileOutputStream(new File("person.dat"));
            oos = new ObjectOutputStream(fs);
            Person p = new Person("jerry", 13, "美国");
            oos.writeObject(p);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test04() {
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("person.dat");
            ois = new ObjectInputStream(fis);
            Person p = (Person) ois.readObject();
            System.out.println(p.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test05() {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("canvs", 22, "香港"));
        persons.add(new Person("Tom", 21, "美国"));
        persons.add(new Person("波多野结衣", 30, "日本"));
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("Persons.dat"));
            oos.writeObject(persons);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test06() {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Persons.dat"));
            ArrayList<Person> people = (ArrayList<Person>) ois.readObject();
            Iterator<Person> iterator = people.iterator();
            while (iterator.hasNext()) System.out.println(iterator.next().toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
