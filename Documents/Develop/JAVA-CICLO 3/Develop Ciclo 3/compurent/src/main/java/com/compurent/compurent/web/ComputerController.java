package com.compurent.compurent.web;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Computer;
import com.compurent.compurent.service.ComputerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins = "*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ComputerController {
    @Autowired
    private ComputerService computerService;

    @GetMapping("/all")
    public List<Computer>getComputers(){
        return computerService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Computer>getComputer(@PathVariable("id")int computerId){
        return computerService.getComputer(computerId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer){
        return computerService.save(computer);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer update(@RequestBody Computer computer){
        return computerService.update(computer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteComputer(@PathVariable("id")int computerId){
    return computerService.deleteComputer(computerId);
    }
}