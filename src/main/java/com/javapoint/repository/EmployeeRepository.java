package com.javapoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javapoint.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
