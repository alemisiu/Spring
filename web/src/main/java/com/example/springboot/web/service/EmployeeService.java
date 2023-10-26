package com.example.springboot.web.service;

import java.util.List;

import com.example.springboot.web.entity.Employee;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
