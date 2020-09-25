package com.cebbank.liuxiaoming.autowire.db.dao.impl;

import com.cebbank.liuxiaoming.autowire.db.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

    public EmployeeDaoImpl() {
        System.out.println("创建EmployeeDaoImpl对象");
    }

    @Override
    public void save() {

    }
}
