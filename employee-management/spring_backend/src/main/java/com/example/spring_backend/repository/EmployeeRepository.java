package com.example.spring_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring_backend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // all crud database methods
}
