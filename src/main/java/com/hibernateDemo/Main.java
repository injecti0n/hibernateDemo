package com.hibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

  public static void main(String[] args){
    EntityManagerFactory xmf = Persistence.createEntityManagerFactory("DBConnect");
    EntityManager mf = xmf.createEntityManager();
    Message msg = new Message();
    msg.setUniqueID(2);
    msg.setMessage("HelloWorld");
    mf.getTransaction().begin();
    System.out.println("Commiting");
    mf.persist(msg);
    mf.getTransaction().commit();
    mf.close();


  }
}
