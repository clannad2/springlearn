package com.cebbank.liuxiaoming.autowire.db.service.impl;

import com.cebbank.liuxiaoming.autowire.db.dao.EmployeeDao;
import com.cebbank.liuxiaoming.autowire.db.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    /**
     * 默认：安装类型自动装配
     * <bean autowire="byType></bean>
     */
    @Qualifier("edi2")
    @Autowired
    private EmployeeDao edi ;

    public EmployeeServiceImpl() {
        System.out.println("创建EmployeeServiceImpl对象");
    }

    @Override
    public int save() {
        return edi.save();
    }
}
