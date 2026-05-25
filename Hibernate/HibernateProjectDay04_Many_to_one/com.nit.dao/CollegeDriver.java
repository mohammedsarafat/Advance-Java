package com.nit.dao;

import com.nit.dto.*;

import jakarta.persistence.*;

public class CollegeDriver {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        College c = new College();
        c.setCname("DRIEMS");

        Student s1 = new Student();
        s1.setName("Sarafat");
        s1.setCollege(c);

        Student s2 = new Student();
        s2.setName("Mohammed");
        s2.setCollege(c);

        et.begin();
        em.persist(c);   
        em.persist(s1);
        em.persist(s2);
        et.commit();

        System.out.println("Data inserted successfully");

    }
}
