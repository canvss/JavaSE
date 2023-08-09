package com.canvs.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLInject {
    String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/canvs?serverTimezone=UTC";

    @Test
    public void test01() throws Exception {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String id = 1002 + " OR 1 = 1";
        String sql = "SELECT * FROM employees WHERE employee_id = " + id;
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            for (int i = 1; i <= 11; i++) {
                System.out.print(resultSet.getObject(i) + "\t\t");
            }
            System.out.println();
        }
        resultSet.close();
        pst.close();
        conn.close();
    }
    @Test
    public void test02() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String id = 1002 + " OR 1 = 1";
        String sql = "SELECT * FROM employees WHERE employee_id = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        //会把id=1002 + " OR 1 = 1"整体赋值给id
        pst.setObject(1,id);
        ResultSet resultSet = pst.executeQuery();
        while(resultSet.next()){
            for (int i = 1; i <= 11; i++) {
                System.out.print(resultSet.getObject(i)+"\t");
            }
        }
        resultSet.close();
        pst.close();
        conn.close();
    }
}
