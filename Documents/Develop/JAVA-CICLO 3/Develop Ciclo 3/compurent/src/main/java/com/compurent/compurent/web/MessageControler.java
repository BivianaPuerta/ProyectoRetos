package com.compurent.compurent.web;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Message;
import com.compurent.compurent.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class MessageControler {
    @Autowired
    private MessageService messageService;


    @GetMapping("/all")
    public List<Message>getMessages(){
        return messageService.getAll();
    }

    @GetMapping("/{idMessage}")
    public Optional<Message>getMessage(@PathVariable("idMessage")int id){
        return messageService.getMessage(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Message save(@RequestBody Message message){
        return messageService.save(message);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Message update(@RequestBody Message message){
        return messageService.update(message);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id")int idMessage){
    return messageService.deleteMessage(idMessage);
    }
}
