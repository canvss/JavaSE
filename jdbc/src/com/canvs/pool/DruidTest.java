package com.canvs.pool;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Properties;

public class DruidTest {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        p.load(DruidTest.class.getClassLoader().getResourceAsStream("druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(p);
        Connection conn = dataSource.getConnection();
        System.out.println(conn);
        conn.close();
    }
}
