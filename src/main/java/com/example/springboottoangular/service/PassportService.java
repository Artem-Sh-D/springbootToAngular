package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Passport;
import com.example.springboottoangular.repository.PassportRepository;
import org.springframework.stereotype.Service;

@Service
public class PassportService {
    private PassportRepository passportRepository;

    public PassportService(PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
    }

    public void addPassport(Passport passport) {
        passportRepository.save(passport);
    }

    public Passport getPassport(String series, String number) {
      return passportRepository.findBySeriesAndNumber(series, number);
    }
}
