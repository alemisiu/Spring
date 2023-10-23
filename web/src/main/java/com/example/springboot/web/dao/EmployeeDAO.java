package com.example.springboot.web.dao;

import java.util.List;

import com.example.springboot.web.entity.Employee;

public interface EmployeeDAO {

    List<Employee> findAll();

}