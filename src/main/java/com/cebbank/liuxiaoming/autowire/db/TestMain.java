package com.cebbank.liuxiaoming.autowire.db;

import com.cebbank.liuxiaoming.autowire.db.dao.impl.EmployeeDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowirebyannotation.xml");
        EmployeeDaoImpl bean = ctx.getBean(EmployeeDaoImpl.class);
        System.out.println(bean);
    }
}
