package com.canvs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SQLGenerateKey {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO user(user_name,password) VALUES('canvs','123456')";
        PreparedStatement pst = conn.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
        int len = pst.executeUpdate();
        System.out.println(len>0?"添加成功":"添加失败");
        ResultSet generatedKeys = pst.getGeneratedKeys();
        while(generatedKeys.next()){
            Object object = generatedKeys.getObject(1);
            System.out.println(object); //1007
        }
        generatedKeys.close();
        pst.close();
        conn.close();
    }
}
