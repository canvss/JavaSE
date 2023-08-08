package com.canvs.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//sql通配符
public class SQLWildCard {
    String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
    //问题引入
    @Test
    public void test() throws Exception {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        int eid = 1002;
        String ename = "Canvs";
        String city = "HONGKONG";
        char gender = '男';
        String email = "canvs@gmail.com";
        String sql = "INSERT INTO emps(eid,ename,city,gender,email)VALUES(" +
                eid + "," +
                "'" + ename +  "'" +"," +
                "'" + city +  "'" +"," +
                "'" + gender + "'" + "," +
                "'" + email + "'" + ")";
        PreparedStatement pst = conn.prepareStatement(sql);
        int len = pst.executeUpdate();
        System.out.println(len > 0 ? "添加成功" : "添加失败");
        pst.close();
        conn.close();
    }
    @Test
    public void test02() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        int eid = 1003;
        String ename = "Lisa";
        String city = "NewYork";
        char gender = '女';
        String email = "lisa@gmail.com";
        String sql = "INSERT INTO emps(eid,ename,city,gender,email) VALUES(?,?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1,eid);
        pst.setObject(2,ename);
        pst.setObject(3,city);
        pst.setString(4,String.valueOf(gender));
        pst.setObject(5,email);
        int len = pst.executeUpdate();
        System.out.println(len > 0 ? "添加成功" : "添加失败");
        pst.close();
        conn.close();
    }
}
