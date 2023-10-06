package com.example.springboottoangular.repository;

import com.example.springboottoangular.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
    public Optional<BankAccount> findByNumber(String number);
}
