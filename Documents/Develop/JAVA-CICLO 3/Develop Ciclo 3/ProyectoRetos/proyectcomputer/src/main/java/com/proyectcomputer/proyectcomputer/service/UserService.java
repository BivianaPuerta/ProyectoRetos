package com.proyectcomputer.proyectcomputer.service;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.User;
import com.proyectcomputer.proyectcomputer.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User>getAll(){
        return userRepository.getAll();
    }

    public Optional<User>getComputer(int userId){
        return userRepository.getUser(userId);
    }

    public User save(User user){
        if(user.getUserId()==null){
            return userRepository.save(user);
        }
        else{
            Optional<User> consult=userRepository.getUser(user.getUserId());
            if(consult.isEmpty()){
                return userRepository.save(user);
            }else{
                return user;
            }
        }
        
    }
    public User update(User user){
        if(user.getUserId()!=null){
            Optional<User> consult=userRepository.getUser(user.getUserId());
            if(!consult.isEmpty()) {
                if(user.getName()!=null){
                    consult.get().setName(user.getName());
                }
                if(user.getEmail()!=null){
                    consult.get().setEmail(user.getEmail());
                }
                if(user.getPassword()!=null){
                    consult.get().setPassword(user.getPassword());
                }
                if(user.getAge()!=null){
                    consult.get().setAge(user.getAge());
                }
                if(user.getInsertDateTime()!=null){
                    consult.get().setInsertDateTime(user.getInsertDateTime());
                }
                return userRepository.save(consult.get());
            }else{
                return user;
            }
        }else{
            return user;
        }
    }

}
