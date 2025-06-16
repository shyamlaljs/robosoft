package com.jdbcproject.springbootjdbc.controller;
import com.jdbcproject.springbootjdbc.dao.EmployeeDAO;
import com.jdbcproject.springbootjdbc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO eDAO;

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return eDAO.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable int id) {
        return eDAO.findById(id);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteById(@PathVariable int id) {
        return eDAO.deleteById(id) + " Employee(s) deleted from the database";
    }

    @PostMapping("/employees")
    public String save(@RequestBody Employee e) {
        return eDAO.save(e) + " Employee(s) saved successfully";
    }

    @PutMapping("/employees/{id}")
    public String update(@RequestBody Employee e, @PathVariable int id) {
        return eDAO.update(e, id) + " Employee(s) updated successfully";
    }
}

