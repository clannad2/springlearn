package com.cebbank.liuxiaoming.autowire.db.servlet;

import com.cebbank.liuxiaoming.autowire.db.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeServlet {

    @Autowired
    private EmployeeServiceImpl esi;

    public EmployeeServlet() {
        System.out.println("创建EmployeeServlet对象");
    }
    public void dopost(){
        esi.save();
    }
}
