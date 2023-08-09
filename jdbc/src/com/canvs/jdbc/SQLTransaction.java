package com.canvs.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLTransaction {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql1 = "UPDATE dept SET dname = 'IT部' WHERE did = 2002";
        String sql2 = "UPDATE dept SET dname = '运维部' WHERE did = 2003";
        conn.setAutoCommit(false);
        try (
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                PreparedStatement pst2 = conn.prepareStatement(sql2);
        ) {
            pst1.executeUpdate();
            pst2.executeUpdate();
            System.out.println("update 2 row");
            conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("update error");
            conn.rollback();    //回滚事务
        }finally {
            conn.close();
        }
    }
    @Test
    public void test() throws Exception{
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql1 = "UPDATE dept SET dname = 'IT部' WHERE did = 2002";
        String sql2 = "UPDATE dept SET dname = '运维部' WHERE eid = 5000";
        conn.setAutoCommit(false);
        try (
                PreparedStatement pst1 = conn.prepareStatement(sql1);
                PreparedStatement pst2 = conn.prepareStatement(sql2);
        ) {
            pst1.executeUpdate();
            pst2.executeUpdate();
            System.out.println("update 2 row");
            conn.commit();
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println("update error");
            conn.rollback();    //回滚事务
        }finally {
            conn.close();
        }
    }
}
