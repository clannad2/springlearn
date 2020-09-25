package com.cebbank.liuxiaoming.bean;

public class Employee {
    private Integer id;
    private String name;
    private Deparment dept;

    public Employee() {
        System.out.println("bean 对象生成");
    }

    public Employee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        System.out.println("bean 设置属性");
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Deparment getDept() {
        return dept;
    }

    public void setDept(Deparment dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public void init(){
        System.out.println("bean 初始化完成");
    }

    public void destory(){
        System.out.println("bean 销毁");
    }
}
