package com.nit.dao;

import com.nit.dto.PanCard;
import com.nit.dto.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class CardDriver {
    public static void main(String[] args) {
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Person p = new Person();
        p.setName("mds");
        p.setaddress("Hyd");
        p.setMob(78945613);
        
        PanCard card = new PanCard();
        card.setCh_name("mds");
        card.setC_number("OEJDP2RW");
        
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
