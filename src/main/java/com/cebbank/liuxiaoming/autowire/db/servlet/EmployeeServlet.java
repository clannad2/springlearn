package com.cebbank.liuxiaoming.autowire.db.servlet;

import org.springframework.stereotype.Controller;

@Controller
public class EmployeeServlet {
    public EmployeeServlet() {
        System.out.println("创建EmployeeServlet对象");
    }
}
