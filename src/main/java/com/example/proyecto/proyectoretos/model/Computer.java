package com.example.proyecto.proyectoretos.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="computer")
public class Computer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numId;
    private String brand;
    private Integer model;
    private Integer category_id;
    private String name;
    public Integer getNumId() {
        return numId;
    }
    public void setNumId(Integer numId) {
        this.numId = numId;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Integer getModel() {
        return model;
    }
    public void setModel(Integer model) {
        this.model = model;
    }
    public Integer getCategory_id() {
        return category_id;
    }
    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    

}
