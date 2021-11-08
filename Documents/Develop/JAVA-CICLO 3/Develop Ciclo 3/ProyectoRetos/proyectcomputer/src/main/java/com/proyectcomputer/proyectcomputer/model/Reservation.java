package com.proyectcomputer.proyectcomputer.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Reservation")
public class Reservation implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reservationId;
    private Integer computerId;
    private Integer userId;
    private String computerName;
    private Date reservationDate;
    private Date devolutionDate;
    private String reservationStatusId;
    private Integer reserveRating;
    private Date insertDateTime;

    @ManyToOne
    @JoinColumn(name="computerId")
    @JsonIgnoreProperties({"Reservation,Computers"})
    private Computer computer;

    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnoreProperties({"Reservation,Users"})
    private User user;

    @ManyToOne
    @JoinColumn(name="reservationStatusId")
    @JsonIgnoreProperties({"Reservation,Users"})
    private ReservationStatus reservationStatus; 
    
    private String score;


    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
    public Integer getReservationId() {
        return reservationId;
    }
    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }
    public Integer getComputerId() {
        return computerId;
    }
    public void setComputerId(Integer computerId) {
        this.computerId = computerId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getComputerName() {
        return computerName;
    }
    public void setComputerName(String computerName) {
        this.computerName = computerName;
    }
    public Date getReservationDate() {
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
    public Date getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    public String getReservationStatusId() {
        return reservationStatusId;
    }
    public void setReservationStatusId(String reservationStatusId) {
        this.reservationStatusId = reservationStatusId;
    }
    public Integer getReserveRating() {
        return reserveRating;
    }
    public void setReserveRating(Integer reserveRating) {
        this.reserveRating = reserveRating;
    }
    public Date getInsertDateTime() {
        return insertDateTime;
    }
    public void setInsertDateTime(Date insertDateTime) {
        this.insertDateTime = insertDateTime;
    }

    

}
