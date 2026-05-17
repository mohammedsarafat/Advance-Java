package com.nit.dao;

import com.nit.dto.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Student e = new Student();
		e.setName("Sarafat");
		e.setCourse("Java");
		e.setMob(7894561378l);
		
		et.begin();
		em.persist(e);
		et.commit();
		IO.println("Data has been inserted successfully..");
	}
}
