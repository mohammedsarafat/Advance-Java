package com.nit.dao;

import com.nit.dto.AadharCard;
import com.nit.dto.Person2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CardDriver {
    public static void main(String[] args) {
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // 1. INSERT
        Person2 p = new Person2();
        p.setName("mds");
        p.setaddress("Hyd");
        p.setMob(78945613);
        
        AadharCard card = new AadharCard();
        card.setCh_name("mds");
        card.setC_number(123478947413l);
        
        p.setCard(card);

        et.begin();
        em.persist(card);
        em.persist(p);
        et.commit();
        IO.println("Data inserted successfully");

        em.close();
        emf.close();
    }
}
