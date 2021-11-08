package com.compurent.compurent.repository.crud;

import com.compurent.compurent.model.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository <Client,Integer> {
    
}
