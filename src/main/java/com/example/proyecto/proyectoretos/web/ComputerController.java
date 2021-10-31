package com.example.proyecto.proyectoretos.web;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.proyectoretos.model.Computer;
import com.example.proyecto.proyectoretos.service.ComputerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins="*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @GetMapping("/all")
    public List<Computer> getComputers(){
        return computerService.getAll();
    }

    @GetMapping("/{numId}")
    public Optional<Computer> getComputer(@PathVariable("numId")int id){
        return computerService.getComputer(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer){
        return computerService.save(computer);
    }
        
    }

