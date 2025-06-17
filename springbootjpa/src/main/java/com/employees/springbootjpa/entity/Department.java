package com.employees.springbootjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    public CharSequence getDepartmentName() {
        return departmentName;
    }

    public CharSequence getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(CharSequence departmentAddress) {
        this.departmentAddress = (String) departmentAddress;
    }

    public void setDepartmentName(CharSequence departmentName) {
        this.departmentName = (String) departmentName;
    }

    public CharSequence getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(CharSequence departmentCode) {
        this.departmentCode = (String) departmentCode;
    }
}
