package com.example.springboot.web.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springboot.web.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    // define the field for entitymanager
    private EntityManager entityManager;

    // set up a contructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll() {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);
        // execute query a get result list
        List<Employee> employees = theQuery.getResultList();
        // return a result
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        // get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);
        // return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        // save the employee
        Employee dbEmployee = entityManager.merge(theEmployee);
        // return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {
        // find employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);
        // remove employee
        entityManager.remove(theEmployee);
    }

}
