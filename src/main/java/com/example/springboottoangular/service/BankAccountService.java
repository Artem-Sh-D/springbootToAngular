package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.BankAccount;
import com.example.springboottoangular.repository.BankAccountRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class BankAccountService {
    private BankAccountRepository bankAccountRepository;

    public BankAccountService(BankAccountRepository bankAccountRepository) {
        this.bankAccountRepository = bankAccountRepository;
    }

    public BankAccount getBankAccount(String number) {
        return bankAccountRepository.findByNumber(number).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Bank is not found"));
    }
}
