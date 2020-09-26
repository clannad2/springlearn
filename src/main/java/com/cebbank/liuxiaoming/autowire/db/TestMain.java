package com.cebbank.liuxiaoming.autowire.db;

import com.cebbank.liuxiaoming.autowire.db.dao.impl.EmployeeDaoImpl;
import com.cebbank.liuxiaoming.autowire.db.service.impl.EmployeeServiceImpl;
import com.cebbank.liuxiaoming.autowire.db.servlet.EmployeeServlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowirebyannotation.xml");
        EmployeeServlet esl = ctx.getBean(EmployeeServlet.class);
        EmployeeServiceImpl esi = ctx.getBean(EmployeeServiceImpl.class);
        EmployeeDaoImpl edi = ctx.getBean(EmployeeDaoImpl.class);
        System.out.println(esi);
        System.out.println(edi);

//        bean.dopost();
    }
}
