package com.example.springboottoangular.repository;

import com.example.springboottoangular.entity.Passport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PassportRepository extends JpaRepository<Passport,Long> {
    public Optional<Passport> findBySeriesAndNumber(String series, String number);
}
