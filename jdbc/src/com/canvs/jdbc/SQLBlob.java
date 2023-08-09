package com.canvs.jdbc;

import org.junit.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLBlob {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        int id = 1001;
        String username = "Canvs";
        String password = "123456";
        String path = "photo.jpg";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO t_user(id,username,password,photo) VALUES(?,?,?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setObject(1, id);
        pst.setObject(2, username);
        pst.setObject(3, password);
        //因为path是一个路径，需要转换为字节io流表示
        pst.setObject(4, new FileInputStream(path));
        int len = pst.executeUpdate();
        System.out.println(len > 0 ? "添加成功" : "添加失败");
        pst.close();
        conn.close();
    }
}
