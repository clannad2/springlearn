package com.cebbank.liuxiaoming.autowire.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("autowirebyxml.xml");
        Teacher teacher = ctx.getBean("teacher2", Teacher.class);
        System.out.println(teacher);
    }
}
