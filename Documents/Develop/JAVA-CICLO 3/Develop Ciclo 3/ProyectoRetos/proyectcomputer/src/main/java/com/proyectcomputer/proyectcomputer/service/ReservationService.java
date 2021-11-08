package com.proyectcomputer.proyectcomputer.service;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.Reservation;
import com.proyectcomputer.proyectcomputer.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation>getAll(){
        return reservationRepository.getAll();
    }

    public Optional<Reservation>getReservation(int reservationId){
        return reservationRepository.getReservation(reservationId);
    }

    public Reservation save(Reservation reservation){
        if(reservation.getReservationId()==null){
            return reservationRepository.save(reservation);
        }
        else{
            Optional<Reservation> consult=reservationRepository.getReservation(reservation.getReservationId());
            if(consult.isEmpty()){
                return reservationRepository.save(reservation);
            }else{
                return reservation;
            }
        }
        
    }

    public Reservation update(Reservation reservation){
        if(reservation.getReservationId()!=null){
            Optional<Reservation> consult=reservationRepository.getReservation(reservation.getReservationId());
            if(!consult.isEmpty()) {
                if(reservation.getComputerName()!=null){
                    consult.get().setComputerName(reservation.getComputerName());
                }
                if(reservation.getDevolutionDate()!=null){
                    consult.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if(reservation.getInsertDateTime()!=null){
                    consult.get().setInsertDateTime(reservation.getInsertDateTime());
                }
                if(reservation.getReserveRating()!=null){
                    consult.get().setReserveRating(reservation.getReserveRating());
                }
                if(reservation.getScore()!=null){
                    consult.get().setScore(reservation.getScore());
                }
                return reservationRepository.save(consult.get());
            }else{
                return reservation;
            }
        }else{
            return reservation;
        }
    }
    public boolean deleteReservation(int reservationId){
        Optional<Reservation>consult=reservationRepository.getReservation(reservationId);
        if(!consult.isEmpty()){
            reservationRepository.delete(consult.get());

            return true;
        }
        return false;
    }

}
