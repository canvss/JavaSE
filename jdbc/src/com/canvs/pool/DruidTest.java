package com.canvs.pool;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.canvs.pool.util.JDBCUtils;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
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
    @Test
    public void test(){
        try {
            Connection conn = JDBCUtils.getConnection();
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
