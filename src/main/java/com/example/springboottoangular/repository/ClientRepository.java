package com.example.springboottoangular.repository;

import com.example.springboottoangular.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {

    public Client findUserByFirstname(String firstName);

    public Optional<Client> findUserByLastname(String lastName);

    public Optional<Client> findUserByEmail(String email);

    public Optional<Client> findUserByPhoneNumber(String phoneNumber);
}
