package com.example.springboottoangular.controller;

import com.example.springboottoangular.entity.Bank;
import com.example.springboottoangular.service.BankService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    private BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }
    @GetMapping("/{name}")
    public Bank getBank(@PathVariable String name) {
        return bankService.getBank(name);
    }

    @PostMapping("/addbank")
    public void createBank(@RequestBody Bank bank) {
        bankService.createBank(bank);
    }
}
