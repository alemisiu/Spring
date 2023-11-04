package com.example.springboot.web.dao;

import com.example.springboot.web.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // thats it .. no need code wtf guys pro

}
