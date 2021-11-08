package com.proyectcomputer.proyectcomputer.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="Users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String name;
    private String email;
    private String password;
    private Integer age;
    private Date insertDateTime;
    private Integer rolId;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="Users")
    @JsonIgnoreProperties({"Users"})
    private List<Message> messages;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy="Users")
    @JsonIgnoreProperties({"Users","Messages"})
    private List<Reservation> reservations;

    @OneToOne
    @JsonIgnoreProperties({"Users"})
    private Rol rol;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public Date getInsertDateTime() {
        return insertDateTime;
    }
    public void setInsertDateTime(Date insertDateTime) {
        this.insertDateTime = insertDateTime;
    }
    public Integer getRolId() {
        return rolId;
    }
    public void setRolId(Integer rolId) {
        this.rolId = rolId;
    }


}
