package com.demo.employeemanager.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.employeemanager.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    
}
