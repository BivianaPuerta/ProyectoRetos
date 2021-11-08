package com.proyectcomputer.proyectcomputer.service;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.Computer;
import com.proyectcomputer.proyectcomputer.repository.ComputerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerService {
    @Autowired
    private ComputerRepository computerRepository;

    public List<Computer>getAll(){
        return computerRepository.getAll();
    }

    public Optional<Computer>getComputer(int computerId){
        return computerRepository.getComputer(computerId);
    }

    public Computer save(Computer computer){
        if(computer.getComputerId()==null){
            return computerRepository.save(computer);
        }
        else{
            Optional<Computer> consult=computerRepository.getComputer(computer.getComputerId());
            if(consult.isEmpty()){
                return computerRepository.save(computer);
            }else{
                return computer;
            }
        }
        
    }

    public Computer update(Computer computer){
        if(computer.getComputerId()!=null){
            Optional<Computer> consult=computerRepository.getComputer(computer.getComputerId());
            if(!consult.isEmpty()) {
                if(computer.getName()!=null){
                    consult.get().setName(computer.getName());
                }
                if(computer.getBrand()!=null){
                    consult.get().setBrand(computer.getBrand());
                }
                if(computer.getYear()!=null){
                    consult.get().setYear(computer.getYear());
                }
                if(computer.getDescription()!=null){
                    consult.get().setDescription(computer.getDescription());
                }
                if(computer.getInsertDateTime()!=null){
                    consult.get().setInsertDateTime(computer.getInsertDateTime());
                }
                return computerRepository.save(consult.get());
            }else{
                return computer;
            }
        }else{
            return computer;
        }
    }

    public boolean deleteComputer(int computerId){
        Optional<Computer> consult=computerRepository.getComputer(computerId);
        if(!consult.isEmpty()){
            computerRepository.delete(consult.get());

            return true;
        }
        return false;
    }
}


