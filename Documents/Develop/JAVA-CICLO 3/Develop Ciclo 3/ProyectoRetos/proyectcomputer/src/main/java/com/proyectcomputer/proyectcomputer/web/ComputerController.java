package com.proyectcomputer.proyectcomputer.web;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.Computer;
import com.proyectcomputer.proyectcomputer.service.ComputerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/Computer")
@CrossOrigin(origins = "*",methods={RequestMethod.GET})

public class ComputerController {
    @Autowired
    private ComputerService computerService;


    @GetMapping("/all")
    public List<Computer>getComputers(){
        return computerService.getAll();
    }

    @GetMapping("/{computerId}")
    public Optional<Computer>getComputer(@PathVariable("computerId")int id){
        return computerService.getComputer(id);
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

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteComputer(@PathVariable("computerId")int computerId){
    return computerService.deleteComputer(computerId);
    }
}
