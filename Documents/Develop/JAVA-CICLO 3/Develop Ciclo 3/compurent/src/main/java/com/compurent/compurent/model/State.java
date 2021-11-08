// package com.compurent.compurent.model;

// import java.io.Serializable;
// import java.util.List;

// import javax.persistence.Entity;
// import javax.persistence.*;
// import javax.persistence.Table;

// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

// @Entity
// @Table(name = "state")
// public class State implements Serializable {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Integer stateId;
//     private String stateName;

//     @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "state")
//     @JsonIgnoreProperties("states")
//     private List<Reservation> reservations;

//     public Integer getStateId() {
//         return stateId;
//     }
//     public void setStateId(Integer stateId) {
//         this.stateId = stateId;
//     }
//     public String getStateName() {
//         return stateName;
//     }
//     public void setStateName(String stateName) {
//         this.stateName = stateName;
//     }
//     public List<Reservation> getReservations() {
//         return reservations;
//     }
//     public void setReservations(List<Reservation> reservations) {
//         this.reservations = reservations;
//     }
    
// }
