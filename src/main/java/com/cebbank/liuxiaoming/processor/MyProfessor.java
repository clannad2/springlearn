package com.cebbank.liuxiaoming.processor;

import com.cebbank.liuxiaoming.bean.Employee;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProfessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法之前执行");

        if (bean instanceof Employee) {
            Employee emp = (Employee) bean;
            emp.setName("大圣");
            return emp;
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("初始化方法之后执行");

        return bean;
    }
}
