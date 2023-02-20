package com.example.mybatis_demo.controller;

import com.example.mybatis_demo.model.Employee;
import com.example.mybatis_demo.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Resource
    EmployeeService employeeService;

    @GetMapping("employee/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

}
