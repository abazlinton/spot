package com.example.codeclanbank.spots.models;

public class Merchant {
    private String name;
    private String location;


    public Merchant(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Merchant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
