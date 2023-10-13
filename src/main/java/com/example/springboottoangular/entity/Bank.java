package com.example.springboottoangular.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

import java.util.List;

@Entity
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is not be empty")
    @Length(min = 2, max = 15)
    private String name;
    @NotBlank(message = "Address is not be empty")
    @Length(min = 10, max = 25)
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
