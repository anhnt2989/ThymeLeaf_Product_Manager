package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private String status;
    private String producer;
    private String country;

    public Product() {
    }

    public Product(int id, String name, String status, String producer, String country) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.producer = producer;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
