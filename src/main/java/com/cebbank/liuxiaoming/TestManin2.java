package com.cebbank.liuxiaoming;

import com.cebbank.liuxiaoming.bean.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestManin2 {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("employspring.xml");
        Employee emp1 = ctx.getBean("emp1", Employee.class);


        System.out.println(emp1);
        ctx.close();
    }
}
