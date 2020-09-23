package com.cebbank.liuxiaoming;

import com.cebbank.liuxiaoming.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
//        Student student = new Student(1,"Tom",20);
        //1.读取配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
        Student stu1 = ctx.getBean("stu1", Student.class);
        System.out.println(stu1);
        Student stu2 = ctx.getBean("stu2",Student.class);
        System.out.println(stu2);
        Student stu3 = ctx.getBean("stu3",Student.class);
        System.out.println(stu3);
//        Student stu4 = ctx.getBean("stu4",Student.class);
//        System.out.println(stu4);
        Student stu5 = ctx.getBean("stu5",Student.class);
        System.out.println(stu5);
        Student stu6 = ctx.getBean("stu6",Student.class);
        System.out.println(stu6);
    }
}
