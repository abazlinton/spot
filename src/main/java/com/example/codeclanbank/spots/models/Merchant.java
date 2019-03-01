package com.example.codeclanbank.spots.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "merchants")
public class Merchant {

    @Column
    private String name;

    @Column
    private String location;

    @OneToMany(mappedBy = "merchant")
    private List<Payment> payments;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Merchant(String name, String location) {
        this.name = name;
        this.location = location;
        this.payments = new ArrayList<>();
    }

    public Merchant() {
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void addPayment(Payment payment){
        this.payments.add(payment);
    }
}
