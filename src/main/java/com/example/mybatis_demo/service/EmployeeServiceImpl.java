package com.example.mybatis_demo.service;

import com.example.mybatis_demo.model.Employee;
import com.example.mybatis_demo.repository.EmployeeRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Resource
    EmployeeRepository employeeRepository;


    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.selectById(id);
    }
}
