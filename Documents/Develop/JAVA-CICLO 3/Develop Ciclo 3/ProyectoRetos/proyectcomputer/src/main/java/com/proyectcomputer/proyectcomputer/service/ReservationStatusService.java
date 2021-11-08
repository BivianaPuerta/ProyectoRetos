package com.proyectcomputer.proyectcomputer.service;

import java.util.List;
import java.util.Optional;

import com.proyectcomputer.proyectcomputer.model.ReservationStatus;
import com.proyectcomputer.proyectcomputer.repository.ReservationStatusRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationStatusService {
    @Autowired
    private ReservationStatusRepository reservationStatusRepository;

    public List<ReservationStatus>getAll(){
        return reservationStatusRepository.getAll();
    }

    public Optional<ReservationStatus>getReservationStatus(int reservationStatusId){
        return reservationStatusRepository.getReservationStatus(reservationStatusId);
    }

    public ReservationStatus save(ReservationStatus reservationStatus){
        if(reservationStatus.getReservationStatusId()==null){
            return reservationStatusRepository.save(reservationStatus);
        }
        else{
            Optional<ReservationStatus> consult=reservationStatusRepository.getReservationStatus(reservationStatus.getReservationStatusId());
            if(consult.isEmpty()){
                return reservationStatusRepository.save(reservationStatus);
            }else{
                return reservationStatus;
            }
        }
        
    }

    public ReservationStatus update(ReservationStatus reservationStatus){
        if(reservationStatus.getReservationStatusId()!=null){
            Optional<ReservationStatus> consult=reservationStatusRepository.getReservationStatus(reservationStatus.getReservationStatusId());
            if(!consult.isEmpty()) {
                if(reservationStatus.getReservationStatusName()!=null){
                    consult.get().setReservationStatusName(reservationStatus.getReservationStatusName());
                }
                if(reservationStatus.getStatus()!=null){
                    consult.get().setStatus(reservationStatus.getStatus());
                }
               
                return reservationStatusRepository.save(consult.get());
            }else{
                return reservationStatus;
            }
        }else{
            return reservationStatus;
        }
    }
    public boolean deleteReservationStatus(int reservationStatusId){
        Optional<ReservationStatus> consult=reservationStatusRepository.getReservationStatus(reservationStatusId);
        if(!consult.isEmpty()){
            reservationStatusRepository.delete(consult.get());

            return true;
        }
        return false;
    }
}
