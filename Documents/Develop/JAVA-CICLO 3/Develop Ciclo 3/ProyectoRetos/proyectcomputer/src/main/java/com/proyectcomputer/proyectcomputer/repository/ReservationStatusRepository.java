package com.proyectcomputer.proyectcomputer.repository;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.ReservationStatus;
import com.proyectcomputer.proyectcomputer.repository.crud.ReservationStatusCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ReservationStatusRepository {
    @Autowired
    private ReservationStatusCrudRepository reservationStatusCrudRepository;

    public List<ReservationStatus> getAll(){
        return (List<ReservationStatus>)reservationStatusCrudRepository.findAll();
    }
    
    public Optional<ReservationStatus>getReservationStatus(int id){
        return reservationStatusCrudRepository.findById(id);
    }

    public ReservationStatus save(ReservationStatus reservationStatus){
        return reservationStatusCrudRepository.save(reservationStatus);
    }

    public void delete(ReservationStatus reservationStatus){
        reservationStatusCrudRepository.delete(reservationStatus);
    }
    
}
