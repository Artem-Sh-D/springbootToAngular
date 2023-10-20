package com.example.springboottoangular.controller;

import com.example.springboottoangular.dto.DtoClient;
import com.example.springboottoangular.dto.DtoUpdateClient;
import com.example.springboottoangular.entity.Client;
import com.example.springboottoangular.service.ClientService;
import jakarta.persistence.PostUpdate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{id}")
     ResponseEntity<?> getClient(@PathVariable Long id) {
        return new ResponseEntity<>(clientService.getClientById(id), HttpStatus.OK);
    }

    @GetMapping("/allclient")
    public List<Client> getClient() {
        return clientService.getClients();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
        return ResponseEntity.ok("Client delete");
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<?> createClient(@RequestBody Client client) {
            clientService.save(client);
            return ResponseEntity.ok("Client create");
        }

    @PutMapping("/{id}")
    public Client updateClient(@PathVariable Long id, @RequestBody Client client) {
        return clientService.updateClient(id, client);
    }
}
