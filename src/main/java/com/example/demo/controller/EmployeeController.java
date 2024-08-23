package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/findall")
    public ArrayList<Employee> getAllEmployee() {
      return employeeService.findAllEmployee();
    }

    @GetMapping("/findbyid/{id}")
    public Employee getEmployeeById(@PathVariable long id){
        return employeeService.findAllEmployeeByID(id);
    }


    @PostMapping("/create")
    public Employee addEmployee(@RequestBody Employee newEmployee){
        return employeeService.saveEmployee(newEmployee);
    }
}
