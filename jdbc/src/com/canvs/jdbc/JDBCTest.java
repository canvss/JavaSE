package com.canvs.jdbc;

import org.junit.Test;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCTest {
    String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";

    @Test
    public void test01() throws ClassNotFoundException, SQLException {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, "root", "Lbwnb123");
        System.out.println(connection);
        connection.close();
    }
    @Test
    public void test02() throws Exception{
        Properties p = new Properties();
        p.load(new FileInputStream("jdbc.properties"));
        String className = p.getProperty("className");
        String url = p.getProperty("url");
        String username = p.getProperty("username");
        String password = p.getProperty("password");
        Class<?> clazz = Class.forName(p.getProperty("className"));
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "SELECT * FROM emps;";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while(resultSet.next()){
            for (int i = 1; i <= 5 ; i++) {
                System.out.print(resultSet.getObject(i)+"\t");
            }
            System.out.println();
        }
        pst.close();
        conn.close();
    }
    @Test
    public void insert() throws Exception {
        //把驱动类加载到内存中
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        //获取数据库连接对象
        Connection connection = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO user(uid,user_name,password) VALUES(1006,'Rose','123456')";
        //获取PreparedStatement IO流 网络编程的socket.getOuputStream()发送数据用的
        PreparedStatement statement = connection.prepareStatement(sql);
        //返回sql影响的记录数
        int len = statement.executeUpdate();
        System.out.println(len > 0 ? "插入成功" : "插入失败");
        statement.close();
        connection.close();
    }

    @Test
    public void update() throws Exception {
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "UPDATE user SET password = '123456' WHERE uid = 1001";
        PreparedStatement pst = conn.prepareStatement(sql);
        int len = pst.executeUpdate();
        System.out.println(len > 0?"修改成功！":"修改失败！");
        pst.close();
        conn.close();
    }
    @Test
    public void delete() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "DELETE from user WHERE uid = 1002";
        PreparedStatement pst = conn.prepareStatement(sql);
        int len = pst.executeUpdate();
        System.out.println(len>0?"删除成功":"删除失败");
        pst.close();
        conn.close();
    }
    @Test
    public void select() throws Exception{
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "SELECT uid,user_name,password FROM user";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet resultSet = pst.executeQuery();
        while(resultSet.next()){
            System.out.print(resultSet.getInt("uid")+"\t");
            System.out.print(resultSet.getString("user_name")+"\t");
            System.out.print(resultSet.getString("password")+"\t");
            System.out.println();
        }
        resultSet.close();
        pst.close();
        conn.close();
    }
}
