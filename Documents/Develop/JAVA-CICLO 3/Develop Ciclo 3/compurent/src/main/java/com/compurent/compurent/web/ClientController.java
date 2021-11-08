package com.compurent.compurent.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Client;
import com.compurent.compurent.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping("/all")
    public List<Client>getClients(){
        return clientService.getAll();
    }

    @GetMapping("/{idClient}")
    public Optional<Client> getClient(@PathVariable("idClient")int id){
        return clientService.getClient(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client){
        return clientService.save(client);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Client update(@RequestBody Client client){
        return clientService.update(client);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteClient(@PathVariable("id")int idClient){
    return clientService.deleteClient(idClient);
    }
}
