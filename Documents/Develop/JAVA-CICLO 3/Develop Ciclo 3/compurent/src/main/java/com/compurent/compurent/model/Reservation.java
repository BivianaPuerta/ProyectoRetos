package com.compurent.compurent.model;


import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="reservation")
public class Reservation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status="created";
    //private Date insertDateTime;

    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("reservations")
    private Computer computer;

    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"reservations","messages"})
    private Client client;

    private String score;

    // @ManyToOne
    // @JoinColumn(name="stateId")
    // @JsonIgnoreProperties("reservation")
    // private State state;

    public Integer getIdReservation() {
        return idReservation;
    }
    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    public Date getDevolutionDate() {
        return devolutionDate;
    }
    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
   
    public Computer getComputer() {
        return computer;
    }
    public void setComputer(Computer computer) {
        this.computer = computer;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score;
    }
      // public Date getInsertDateTime() {
    //     return insertDateTime;
    // }
    // public void setInsertDateTime(Date insertDateTime) {
    //     this.insertDateTime = insertDateTime;
    // }
    
    // public State getState() {
    //     return state;
    // }
    // public void setState(State state) {
    //     this.state = state;
    // }
    
}
