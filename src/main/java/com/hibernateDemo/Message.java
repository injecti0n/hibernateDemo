package com.hibernateDemo;

import javax.persistence.*;

@Entity
public class Message {
  @Id
  private int uniqueID;
  private String message;

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
