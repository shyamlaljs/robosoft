package com.jdbcproject.springbootjdbc.dao;

import com.jdbcproject.springbootjdbc.entity.Employee;

import java.util.List;


public interface EmployeeDAO {

    List<Employee> findAll();
    Employee findById(int id);
    int deleteById(int id);
    int save(Employee e);
    int update(Employee e, int id);
}
