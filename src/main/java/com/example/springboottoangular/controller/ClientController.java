package com.example.springboottoangular.controller;

import com.example.springboottoangular.dto.DtoClient;
import com.example.springboottoangular.entity.Client;
import com.example.springboottoangular.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    private ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/{firstname}")
     Client getClient(@PathVariable String firstname) {
        return clientService.getClient(firstname);
    }

    @GetMapping("/allclient")
    public List<Client> getClient() {
        return clientService.getClients();
    }

    @PostMapping("/create")
    public void setUser(@RequestBody DtoClient.DtoClientCreate dtoClient) {
        clientService.save(dtoClient);
    }
}
