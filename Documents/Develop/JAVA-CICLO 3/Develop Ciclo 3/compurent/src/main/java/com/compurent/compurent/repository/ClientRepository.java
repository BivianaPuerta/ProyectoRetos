package com.compurent.compurent.repository;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Client;
import com.compurent.compurent.repository.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>)clientCrudRepository.findAll();
    }
    
    public Optional<Client> getClient(int id){
        return clientCrudRepository.findById(id);
    }

    public Client save( Client client){
        return clientCrudRepository.save(client);
    }

    public void delete(Client client){
        clientCrudRepository.delete(client);
    }
}
