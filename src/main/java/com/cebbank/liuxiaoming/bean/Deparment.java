package com.cebbank.liuxiaoming.bean;

import java.util.List;

public class Deparment {
    private Integer id;
    private String name;

    private List<Employee> emps;

    public Deparment() {
    }

    public Deparment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deparment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
