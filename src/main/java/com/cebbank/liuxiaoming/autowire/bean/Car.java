package com.cebbank.liuxiaoming.autowire.bean;

public class Car {
    private String brand;
    private Double price;

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
