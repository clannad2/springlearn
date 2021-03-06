package com.cebbank.liuxiaoming.autowire.bean;

public class Teacher {
    private String name;
    private Address address;
    private Car car;

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Car getCar() {
        return car;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", car=" + car +
                '}';
    }
}
