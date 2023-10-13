package com.example.springboottoangular.entity;

import jakarta.persistence.*;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number;

    private String status;
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id", foreignKey = @ForeignKey(ConstraintMode.NO_CONSTRAINT))
    private Bank bank;

    public BankAccount() {
    }

    public BankAccount(String number, String status) {
        this.number = number;
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
