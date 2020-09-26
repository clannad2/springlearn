package com.cebbank.liuxiaoming.autowire.db.dao.impl;

import com.cebbank.liuxiaoming.autowire.db.dao.EmployeeDao;
import org.springframework.stereotype.Repository;

@Repository("edi2")
public class EmployeeDaoImpl2 implements EmployeeDao {

    public EmployeeDaoImpl2() {
        System.out.println("创建EmployeeDaoImpl对象");
    }

    @Override
    public int save() {
        System.out.println("保存员工信息2 ");
        return 0;
    }
}
