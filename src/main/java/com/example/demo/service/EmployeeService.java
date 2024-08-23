package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.ArrayList;

public interface EmployeeService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    Employee saveEmployee(Employee newEmployee);

}
