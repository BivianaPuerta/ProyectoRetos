package com.proyectcomputer.proyectcomputer.repository;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.Message;
import com.proyectcomputer.proyectcomputer.repository.crud.MessageCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>)messageCrudRepository.findAll();
    }
    
    public Optional<Message>getMessage(int id){
        return messageCrudRepository.findById(id);
    }

    public Message save(Message message){
        return messageCrudRepository.save(message);
    }

    public void delete(Message message){
        messageCrudRepository.delete(message);
    }
    
}
