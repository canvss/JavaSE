package com.canvs.dbutils;

import com.canvs.jdbc2.bean.Customer;
import com.canvs.pool.util.JDBCUtils;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import org.junit.Test;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class QueryRunnerTest {
    @Test
    public void testInsert() throws SQLException {
        QueryRunner runner = new QueryRunner();
        Connection conn = JDBCUtils.getConnection();
        String sql = "INSERT INTO customer VALUE(?,?,?,?)";
        int count = runner.update(conn, sql, 1003, "ros", "ros@qq.com", "2001-9-16");
        System.out.println("添加了 "+count+" 条记录");
        DbUtils.close(conn);
    }
    @Test
    public void testDelete() throws SQLException {
        QueryRunner runner = new QueryRunner();
        Connection conn = JDBCUtils.getConnection();
        String sql = "DELETE FROM customer WHERE id = ?";
        int count = runner.update(conn,sql, 1005);
        System.out.println(count);
        DbUtils.close(conn);
    }
    @Test
    public void testQueryInstance() throws SQLException {
        QueryRunner runner = new QueryRunner();
        Connection conn = JDBCUtils.getConnection();
        String sql = "SELECT * FROM customer WHERE id = ?";
        BeanHandler<Customer> handler = new BeanHandler<>(Customer.class);
        Customer customer = runner.query(conn,sql, handler,1002);
        System.out.println(customer);
        DbUtils.close(conn);
    }
    @Test
    public void testQueryList() throws SQLException {
        QueryRunner runner = new QueryRunner();
        Connection conn = JDBCUtils.getConnection();
        String sql = "SELECT * FROM customer";
        BeanListHandler<Customer> handler = new BeanListHandler<>(Customer.class);
        List<Customer> cust = runner.query(conn, sql, handler);
        cust.forEach(System.out::println);
        DbUtils.close(conn);
    }
    //自定义ResultSetHandler的实现类
    @Test
    public void testQueryInstance1() throws SQLException {
        QueryRunner runner = new QueryRunner();
        Connection conn = JDBCUtils.getConnection();
        String sql = "SELECT * FROM customer WHERE id = ?";
        ResultSetHandler<Customer> handler = new ResultSetHandler<Customer>() {
            @Override
            public Customer handle(ResultSet resultSet) throws SQLException {
                if (resultSet.next()){
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String email = resultSet.getString("email");
                    Date birth = resultSet.getDate("birth");
                    return new Customer(id,name,email,birth);
                }
                return null;
            }
        };
        Customer customer = runner.query(conn, sql, handler,1001);
        System.out.println(customer);
        DbUtils.close(conn);
    }
    @Test
    public void testQueryValue() throws SQLException {
        QueryRunner runner = new QueryRunner();
        Connection conn = JDBCUtils.getConnection();
        String sql = "SELECT MAX(birth) FROM customer";
        Date birth = (Date) runner.query(conn, sql, new ScalarHandler());
        System.out.println(birth);
        DbUtils.close(conn);
    }
}
