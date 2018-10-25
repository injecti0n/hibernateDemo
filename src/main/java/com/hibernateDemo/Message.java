package com.hibernateDemo;



import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.sql.Date;

@Entity
public class Message {
  @Id
  private int uniqueID;
  private String message;
  private LocalDate date;

  @Convert
  LocalDate l = LocalDate.now();

  Date d = new Date(0);
  LocalDate localDate = LocalDate.ofEpochDay(d.getTime());
  Date normalDate = new Date(localDate.toEpochDay());


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

  public LocalDate getDate() {
    setDate(l);

    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }
}
