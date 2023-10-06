package com.example.springboottoangular.repository;

import com.example.springboottoangular.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankRepository extends JpaRepository<Bank, Long> {
    public Optional<Bank> findBankByName(String name);

    public Optional<Bank> findBankByAddress(String address);
}
