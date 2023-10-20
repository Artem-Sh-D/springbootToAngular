package com.example.springboottoangular.repository;

import com.example.springboottoangular.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {

    Optional<Client> findClientByFirstnameAndLastname(String firstname, String lastname);

    Optional<Client> findClientByEmail(String email);

    Optional<Client> findClientByPhoneNumber(String phoneNumber);


}
