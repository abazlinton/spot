package com.example.codeclanbank.spots.models;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {
    @Column
    private double amount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "merchant_id")
    private Merchant merchant;

    public Payment(double amount, Merchant merchant) {
        this.amount = amount;
        this.merchant = merchant;
    }

    public Payment(double amount) {
        this.amount = amount;
    }

    public Payment() {
    }

    public double getAmount() {
        return amount;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
