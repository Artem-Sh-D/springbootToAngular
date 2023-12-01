package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Airport;
import com.example.springboottoangular.entity.Company;
import com.example.springboottoangular.repository.CompanyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class CompanyService {
    private CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company get(Long id) {
        return companyRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Company is not found"));
    }

    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    public Company create(Company company){
        return companyRepository.save(company);
    }

}
