package com.demo.employeemanager.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

import com.demo.employeemanager.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional findEmployeeById(Long id);
}
