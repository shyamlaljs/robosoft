package com.jdbcproject.springbootjdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String location;
    private String department;

    public Employee(String name, String location, String department) {
        this.name = name;
        this.location = location;
        this.department = department;
    }

    public Object getName() {
        return name;
    }

    public Object getLocation() {
        return location;
    }

    public Object getDepartment() {
        return department;
    }
}



