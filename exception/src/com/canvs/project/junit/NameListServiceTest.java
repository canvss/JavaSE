package com.canvs.project.junit;

import com.canvs.project.domain.Employee;
import com.canvs.project.service.NameListService;
import com.canvs.project.service.TeamException;
import org.junit.Test;

import java.util.Arrays;

/**
 * _*_ coding: utf-8 _*_
 * created by Canvs on 2023/6/26 16:19
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees() {
        NameListService listService = new NameListService();
        Employee[] allEmployees = listService.getAllEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
        }
    }
    @Test
    public void testGetEmployee(){
        NameListService listService = new NameListService();
        try {
            Employee employee = listService.getEmployee(1);
            System.out.println(employee);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }
}
