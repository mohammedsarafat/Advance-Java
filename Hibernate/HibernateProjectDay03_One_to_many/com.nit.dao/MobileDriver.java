package com.nit.dao;

import java.util.ArrayList;
import java.util.List;

import com.nit.dto.Mobile;
import com.nit.dto.SimCard;

import jakarta.persistence.*;

public class MobileDriver {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Mobile m = new Mobile();
        m.setM_name("Motorola");
        m.setColor("Magenta");

        SimCard s1 = new SimCard();
        s1.setSname("Jio");
        s1.setPrice(200);

        SimCard s2 = new SimCard();
        s2.setSname("Airtel");
        s2.setPrice(220);

        List<SimCard> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);

        m.setSimCards(list);

        et.begin();
        em.persist(s1);
        em.persist(s2);
        em.persist(m); 
        et.commit();

        System.out.println("Data inserted successfully");

        
       
    }
}
