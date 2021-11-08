package com.proyectcomputer.proyectcomputer.model;

import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Rol")
public class Rol implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rolId;
    private String rolName;

    @OneToOne
    @JsonIgnoreProperties({"Rol"})
    private User user;

    public Integer getRolId() {
        return rolId;
    }
    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }
    public String getRolName() {
        return rolName;
    }
    public void setRolName(String rolName) {
        this.rolName = rolName;
    }

    
}
