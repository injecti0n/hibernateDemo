package com.hibernateDemo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "UserInfo")
public class User {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "login")
    private String username;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Enumerated(EnumType.STRING)
    private UserType type;

    @Transient
    private int notToDatabase;

    @ManyToMany
    private List<Message> messages;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Message> getMessages() {
        if (messages == null) messages = new ArrayList<>();
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
