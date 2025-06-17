package com.employees.springbootjpa.repository;

import com.employees.springbootjpa.entity.Department; // Import your Department entity
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
