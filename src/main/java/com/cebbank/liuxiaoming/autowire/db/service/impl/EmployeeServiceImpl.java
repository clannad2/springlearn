package com.cebbank.liuxiaoming.autowire.db.service.impl;

import com.cebbank.liuxiaoming.autowire.db.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    public EmployeeServiceImpl() {
        System.out.println("创建EmployeeServiceImpl对象");
    }

    @Override
    public void save() {

    }
}
