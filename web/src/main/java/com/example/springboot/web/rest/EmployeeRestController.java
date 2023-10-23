package com.example.springboot.web.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.web.dao.EmployeeDAO;
import com.example.springboot.web.entity.Employee;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    private EmployeeDAO employeeDAO;

    // quick and dirty : inject employee dao
    public EmployeeRestController(EmployeeDAO theEMpEmployeeDAO) {
        employeeDAO = theEMpEmployeeDAO;
    }

    // expose "/employees" and return alist of the employees
    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

}
