package com.example.springboottoangular.service;

import com.example.springboottoangular.entity.Client;
import com.example.springboottoangular.repository.ClientRepository;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ClientService {
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void save(@Valid Client client) {

    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClientByFirstnameAndLastname(String firstname, String lastname) {
        return clientRepository.findClientByFirstnameAndLastname(firstname,lastname).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

    }

    public Client getClientByEmail(String email) {
        return clientRepository.findClientByEmail(email).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

    }

    public Client getClientByPhoneNumber(String phoneNumber) {
        return clientRepository.findClientByPhoneNumber(phoneNumber).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

    }

    public void deleteClient(Long id) {
       clientRepository.delete(clientRepository.findById(id).
               orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found")));
    }

    public updateClient updateClient(Long id, Client updateClient) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        clientRepository.save(updateClient);
    }
}
