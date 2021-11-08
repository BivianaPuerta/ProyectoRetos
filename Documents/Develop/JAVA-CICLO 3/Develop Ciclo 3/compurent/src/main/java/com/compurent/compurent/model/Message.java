package com.compurent.compurent.model;

import java.io.Serializable;
//import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="message")
public class Message implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;
    private String messageText;
    //private Date insertDateTime;
    //private Boolean readed;

    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Computer computer;

    @ManyToOne
    @JoinColumn(name="idClient")
    @JsonIgnoreProperties({"messages", "reservations"})
    private Client client;
    
    public Integer getIdMessage() {
        return idMessage;
    }
    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }
    public String getMessageText() {
       return messageText;
    }
    public void setMessageText(String messageText) {
       this.messageText = messageText;
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
    
    // public Date getInsertDateTime() {
    //     return insertDateTime;
    // }
    //  public void setInsertDateTime(Date insertDateTime) {
    //     this.insertDateTime = insertDateTime;
    // }
    // public Boolean getReaded() {
    //     return readed;
    // }
    //  public void setReaded(Boolean readed) {
    //     this.readed = readed;
    // }
}

