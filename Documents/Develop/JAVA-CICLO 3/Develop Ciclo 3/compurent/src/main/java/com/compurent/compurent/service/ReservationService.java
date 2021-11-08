package com.compurent.compurent.service;

import java.util.List;
import java.util.Optional;

import com.compurent.compurent.model.Reservation;
import com.compurent.compurent.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation>getAll(){
        return reservationRepository.getAll();
    }

    public Optional<Reservation>getReservation(int idReservation){
        return reservationRepository.getReservation(idReservation);
    }

    public Reservation save(Reservation reservation){
        if(reservation.getIdReservation()==null){
            return reservationRepository.save(reservation);
        }
        else{
            Optional<Reservation> consult=reservationRepository.getReservation(reservation.getIdReservation());
            if(consult.isEmpty()){
                return reservationRepository.save(reservation);
            }else{
                return reservation;
            }
        }
    }
    public Reservation update(Reservation reservation){
        if(reservation.getIdReservation()!=null){
            Optional<Reservation> consult=reservationRepository.getReservation(reservation.getIdReservation());
            if(!consult.isEmpty()) {
                if(reservation.getStartDate()!=null){
                    consult.get().setStartDate(reservation.getStartDate());
                }
                if(reservation.getDevolutionDate()!=null){
                    consult.get().setDevolutionDate(reservation.getDevolutionDate());
                }
                if(reservation.getStatus()!=null){
                    consult.get().setStatus(reservation.getStatus());
                }
                if(reservation.getScore()!=null){
                    consult.get().setScore(reservation.getScore());
                }
                // if(reservation.getInsertDateTime()!=null){
                //     consult.get().setInsertDateTime(reservation.getInsertDateTime());
                // }
                return reservationRepository.save(consult.get());
            }else{
                return reservation;
            }
        }else{
            return reservation;
        }
    }
    public boolean deleteReservation(int idReservation){
        Optional<Reservation>consult=reservationRepository.getReservation(idReservation);
        if(!consult.isEmpty()){
            reservationRepository.delete(consult.get());
            return true;
        }
        return false;
    }
}
