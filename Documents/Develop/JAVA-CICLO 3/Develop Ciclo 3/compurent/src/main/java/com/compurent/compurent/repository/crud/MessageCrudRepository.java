package com.compurent.compurent.repository.crud;

import com.compurent.compurent.model.Message;

import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message,Integer> {
    
}
