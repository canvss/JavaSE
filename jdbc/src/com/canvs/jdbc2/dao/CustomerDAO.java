package com.canvs.jdbc2.dao;

import com.canvs.jdbc2.bean.Customer;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public interface CustomerDAO {
    void insert(Connection conn,Customer cust);
    void deleteById(Connection conn,int id);
    void update(Connection conn, Customer cust);
    Customer getCustomerById(Connection conn,int id);
    List<Customer> getAll(Connection conn);
    Long getCount(Connection conn);
    Date getMaxBirth(Connection conn);
}
