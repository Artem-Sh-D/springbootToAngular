package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Bank;
import com.example.springboottoangular.repository.BankRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class BankService {
   private BankRepository bankRepository;

    public BankService(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    public Bank getBank(String name) {
        return bankRepository.findBankByName(name).orElseThrow(() -> ResponseStatusException());
    }

    public void createBank(@Valid Bank bank) {
        bankRepository.save(bank);
    }

    public List<Bank> getBanks() {
        return bankRepository.findAll();
    }
    public void updateBank(@Valid Bank bank) {
    }

}
