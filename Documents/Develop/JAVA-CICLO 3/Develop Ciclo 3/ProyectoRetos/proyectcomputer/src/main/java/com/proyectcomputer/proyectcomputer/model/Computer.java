package com.proyectcomputer.proyectcomputer.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="Computers")
public class Computer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer computerId;
    private String brand;
    private Integer year;
    private Integer categoryId;
    private String name;
    private String description;
    private Date insertDateTime;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "Computers")
    @JsonIgnoreProperties({"Computers,Reservation"})
    private List<Message> messages; 

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "Computers")
    @JsonIgnoreProperties({"Computers,Reservation"})
    private List<Reservation> reservations;

    @ManyToOne
    @JoinColumn(name="categoryId")
    @JsonIgnoreProperties({"Category,Computer"})
    private Category category;

    public Date getInsertDateTime() {
        return insertDateTime;
    }
    public void setInsertDateTime(Date insertDateTime) {
        this.insertDateTime = insertDateTime;
    }
    public Integer getComputerId() {
        return computerId;
    }
    public void setComputerId(Integer computerId) {
        this.computerId = computerId;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }
    public Integer getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    
    
    
}
