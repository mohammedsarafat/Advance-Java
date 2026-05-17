package com.nit.dao;

import com.nit.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Employee e = new Employee();
		e.setName("mds");
		e.setDept("Sales");
		e.setSalary(8000);
		e.setMob(78945613);
    
		et.begin();
		em.persist(e);
		et.commit();
		IO.println("Data has been inserted successfully..");
	}
}
