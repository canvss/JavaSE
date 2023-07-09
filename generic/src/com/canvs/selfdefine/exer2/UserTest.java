package com.canvs.selfdefine.exer2;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/7/9 21:30
 */
public class UserTest {
    @Test
    public void test01(){
        DAO<User> dao = new DAO<>();
        User u1 = new User(1,22,"Tom");
        User u2 = new User(2,18,"Jack");
        User u3 = new User(3,25,"Jerry");
        dao.save("1001",u1);
        dao.save("1002",u2);
        dao.save("1003",u3);
        List list = dao.list();
        System.out.println(list);
        Object o = dao.get("1002");
        System.out.println(o);
        System.out.println();
        dao.update("1001",new User(4,25,"Canvs"));
//        dao.delete("1003");
        Iterator iterator = dao.list().iterator();
        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
