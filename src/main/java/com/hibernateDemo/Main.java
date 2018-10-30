package com.hibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("dataSource");
        EntityManager em =
                emf.createEntityManager();

        Message message = new Message();
        message.setMessage("Hello Database");

        User user = new User();
        user.setUsername("PhiberOptik");
        user.getMessages().add(message);


        em.persist(message);
        em.persist(user);

        em.getTransaction().begin();
        em.getTransaction().commit();



        emf.close();
    }
}
