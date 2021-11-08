package com.proyectcomputer.proyectcomputer.repository.crud;

import com.proyectcomputer.proyectcomputer.model.Message;

import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository  extends CrudRepository<Message,Integer>{
    
}
