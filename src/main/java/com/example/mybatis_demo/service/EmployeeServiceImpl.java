package com.example.mybatis_demo.service;

import com.example.mybatis_demo.model.Employee;
import com.example.mybatis_demo.mapper.EmployeeMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Resource
    EmployeeMapper employeeMapper;


    @Override
    public Employee getEmployeeById(Long id) {
        return employeeMapper.selectById(id);
    }
}
