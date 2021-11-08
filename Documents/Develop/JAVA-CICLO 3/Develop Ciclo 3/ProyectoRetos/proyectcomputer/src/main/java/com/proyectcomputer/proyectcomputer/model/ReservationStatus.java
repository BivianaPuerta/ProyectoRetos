package com.proyectcomputer.proyectcomputer.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="ReservationStatus")
public class ReservationStatus implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationStatusId;
    private String reservationStatusName;
    private String status="created";
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "Reservation")
    @JsonIgnoreProperties({"ReservationStatus,Reservation"})
    private List<Reservation> reservations; 

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Integer getReservationStatusId() {
        return reservationStatusId;
    }
    public void setReservationStatusId(Integer reservationStatusId) {
        this.reservationStatusId = reservationStatusId;
    }
    public String getReservationStatusName() {
        return reservationStatusName;
    }
    public void setReservationStatusName(String reservationStatusName) {
        this.reservationStatusName = reservationStatusName;
    }
    public void delete(ReservationStatus reservationStatus) {
    }

    
}
