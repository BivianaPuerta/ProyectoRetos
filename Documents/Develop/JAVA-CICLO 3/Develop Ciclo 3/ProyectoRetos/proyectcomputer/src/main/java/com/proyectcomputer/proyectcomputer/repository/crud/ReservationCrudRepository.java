package com.proyectcomputer.proyectcomputer.repository.crud;

import com.proyectcomputer.proyectcomputer.model.Reservation;

import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {
    
}
