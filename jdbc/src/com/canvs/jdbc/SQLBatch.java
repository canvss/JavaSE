package com.canvs.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SQLBatch {
    @Test
    public void test01() throws Exception{
        long start = System.currentTimeMillis();
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO dept(dname,`desc`) VALUES(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        for (int i = 1; i <= 1000; i++) {
            pst.setObject(1,"部门 "+i);
            pst.setObject(2,"部门说明 "+i);
            int len = pst.executeUpdate();  //意味着需要IO流与文件通信1000次
            System.out.println("第"+i+"条 "+(len > 0 ? "添加成功" : "添加失败"));
        }
        pst.close();
        conn.close();
        long end = System.currentTimeMillis();
        System.out.println("一共耗时："+(end-start)+"ms");
    }
    @Test
    public void test02() throws Exception{
        long start = System.currentTimeMillis();
        String url = "jdbc:mysql://bj-cynosdbmysql-grp-an5acmhk.sql.tencentcdb.com:28067/demo?serverTimezone=UTC&rewriteBatchedStatements=true";
        Class<?> clazz = Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, "root", "Lbwnb123");
        String sql = "INSERT INTO dept(dname,`desc`) VALUES(?,?)";
        PreparedStatement pst = conn.prepareStatement(sql);
        for (int i = 1; i <=1000 ; i++) {
            pst.setObject(1,"部门 "+i);
            pst.setObject(2,"部门说明 "+i);
            //不需要设置一次执行一次；设置完成，会重新编译sql，生成一条完整的sql
            pst.addBatch();
        }
        //一次性执行完
        pst.executeBatch();
        pst.close();
        conn.close();
        long end = System.currentTimeMillis();
        System.out.println("一共耗时："+(end-start)+"ms");
    }
}
