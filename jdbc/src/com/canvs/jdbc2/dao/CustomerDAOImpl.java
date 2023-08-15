package com.canvs.jdbc2.dao;

import com.canvs.jdbc2.bean.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import java.util.List;

public class CustomerDAOImpl extends BaseDAO<Customer> implements CustomerDAO {
    @Override
    public void insert(Connection conn, Customer cust) {
        String sql = "INSERT INTO customer(id,name,email,birth) VALUES (?,?,?,?)";
        update(conn, sql, cust.getId(), cust.getName(), cust.getEmail(), cust.getBirth());
    }

    @Override
    public void deleteById(Connection conn, int id) {
        String sql = "DELETE FROM customer WHERE id = ?";
        update(conn, sql, id);
    }

    @Override
    public void update(Connection conn, Customer cust) {
        String sql = "UPDATE customer SET name = ?,email=?,birth = ? WHERE id = ?";
        update(conn,sql,cust.getName(),cust.getEmail(),cust.getBirth(),cust.getId());
    }

    @Override
    public Customer getCustomerById(Connection conn, int id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return getInstance(conn,sql,id);
    }

    @Override
    public List<Customer> getAll(Connection conn) {
        String sql = "SELECT * FROM customer";
        return getForList(conn,sql);
    }

    @Override
    public Long getCount(Connection conn) {
        String sql = "SELECT COUNT(*) FROM customer";
        return getValue(conn,sql);
    }

    @Override
    public Date getMaxBirth(Connection conn) {
        String sql = "SELECT MAX(birth) FROM customer";
        return getValue(conn,sql);
    }
}
