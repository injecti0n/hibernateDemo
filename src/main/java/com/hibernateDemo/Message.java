package com.hibernateDemo;

import javax.persistence.*;
import java.util.List;

@Entity
public class Message {
    @Id
    @GeneratedValue
    private int uniqueID;
    private String message;

    @ManyToMany
    private List<User> userList;

    public int getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(int uniqueID) {
        this.uniqueID = uniqueID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
