package com.example.springboottoangular.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 20, message = "Name must be between 2 and 20 characters")
    private String name;
    @NotBlank(message = "Address is not be empty")
    @Size(min = 10, max = 100, message = "Address must be between 20 and 100 characters")
    private String address;

    private Boolean isActive;

    @OneToMany(mappedBy = "bank", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<BankAccount> bankAccounts;

    public Bank() {
    }

    public Bank( String name, String address, Boolean isActive) {
        this.name = name;
        this.address = address;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }
}
