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

    public Client getClientById(Long id) {
        return clientRepository.findById(id).
                orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));

    }

    public boolean deleteClient(Long id) {
       clientRepository.delete(clientRepository.findById(id).
               orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found")));
       return true;
    }

    public Client updateClient(Long id, Client updateClient) {
        Client client = clientRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Resource not found"));
        return null;
    }
}
