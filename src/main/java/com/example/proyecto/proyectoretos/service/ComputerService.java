package com.example.proyecto.proyectoretos.service;

import java.util.List;
import java.util.Optional;

import com.example.proyecto.proyectoretos.model.Computer;
import com.example.proyecto.proyectoretos.repository.ComputerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {

    @Autowired
    private ComputerRepository computerRepository;

    public List<Computer> getAll(){
        return computerRepository.getAll();
    }

    public Optional<Computer> getComputer(int id){
    return computerRepository.getComputer(id);
    }

    public Computer save(Computer computer){
        if (computer.getNumId()==null){
            return computerRepository.save(computer);
        }
        else{
            Optional<Computer> consulta=computerRepository.getComputer(computer.getNumId());
            if (consulta.isEmpty()){
                return computerRepository.save(computer);
            }else{
                return computer;
            }
        }
    }
}
