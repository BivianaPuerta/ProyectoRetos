package com.proyectcomputer.proyectcomputer.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Messages")
public class Message implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageId;
    private Integer userId;
    private String messageText;
    private Date insertDateTime;
    private Boolean readed;


    @ManyToOne
    @JoinColumn(name="userId")
    @JsonIgnoreProperties({"Messages,Users,Reservation"})
    private User user;

    @ManyToOne
    @JoinColumn(name="computerId")
    @JsonIgnoreProperties({"Messages,Computers,Reservation"})
    private Computer computer;

    public Integer getMessageId() {
        return messageId;
    }
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getMessageText() {
        return messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
    public Date getInsertDateTime() {
        return insertDateTime;
    }
    public void setInsertDateTime(Date insertDateTime) {
        this.insertDateTime = insertDateTime;
    }
    public Boolean getReaded() {
        return readed;
    }
    public void setReaded(Boolean readed) {
        this.readed = readed;
    }

    
    
}
