package com.example.mybatis_demo.repository;

import com.example.mybatis_demo.model.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

//@Mapper
public interface EmployeeRepository extends BaseMapper<Employee> {
    Employee findById(@Param("id") Long id);

}
