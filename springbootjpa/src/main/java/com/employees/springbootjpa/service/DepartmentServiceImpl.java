package com.employees.springbootjpa.service;

import com.employees.springbootjpa.entity.Department;
import com.employees.springbootjpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        Optional<Department> departmentOptional = departmentRepository.findById(departmentId);

        if (departmentOptional.isPresent()) {
            Department departmentDb = departmentOptional.get();

            if (department.getDepartmentName() != null && !department.getDepartmentName().isEmpty()) {
                departmentDb.setDepartmentName(department.getDepartmentName());
            }

            if (department.getDepartmentAddress() != null && !department.getDepartmentAddress().isEmpty()) {
                departmentDb.setDepartmentAddress(department.getDepartmentAddress());
            }

            if (department.getDepartmentCode() != null && !department.getDepartmentCode().isEmpty()) {
                departmentDb.setDepartmentCode(department.getDepartmentCode());
            }

            return departmentRepository.save(departmentDb);
        } else {
            // Handle the case where the department is not found
            return null;
        }
    }

    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
