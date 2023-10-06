package com.example.springboottoangular.service;

import com.example.springboottoangular.dto.DtoClient;
import com.example.springboottoangular.entity.Client;
import com.example.springboottoangular.entity.Passport;
import com.example.springboottoangular.repository.ClientRepository;
import com.example.springboottoangular.repository.PassportRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private PassportRepository passportRepository;
    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository, PassportRepository passportRepository) {
        this.passportRepository = passportRepository;
        this.clientRepository = clientRepository;
    }

    public void save(DtoClient dtoClient) {
        passportRepository.save(passport);
        client.setPassport(passport);
        clientRepository.save(client);
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }

    public Client getClient(String firstname) {
        return clientRepository.findUserByFirstname(firstname);
    }

}
