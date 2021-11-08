package com.proyectcomputer.proyectcomputer.repository.crud;

import com.proyectcomputer.proyectcomputer.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User,Integer> {
    
}
