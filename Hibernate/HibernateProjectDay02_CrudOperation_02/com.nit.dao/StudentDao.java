package com.nit.dao;

import com.nit.dto.Student2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDao {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		// 1. INSERT
        Student2 s = new Student2();
        s.setName("mds");
        s.setCourse("Sales");
        s.setMob(7894561325l);

        et.begin();
        em.persist(s);
        et.commit();
        IO.println("Inserted successfully");

        // 2. FETCH
        Student2 stu = em.find(Student2.class, 1);
        if (stu != null) {
            IO.println(stu.getId());
            IO.println(stu.getName());
            IO.println(stu.getCourse());
            IO.println(stu.getMob());
        } else {
            IO.println("Student2 not found");
        }

        // 3. UPDATE
        Student2 stu1 = em.find(Student2.class, 1);
        if (stu1 != null) {
            et.begin();
            stu1.setName("Mds");
            stu1.setCourse("Cse");
            stu1.setMob(4567891234L);
            et.commit(); 
            IO.println("Updated successfully");
        }

        // 4. DELETE
        Student2 stu2 = em.find(Student2.class, 1);
        if (stu2 != null) {
            et.begin();
            em.remove(stu2);
            et.commit();
            IO.println("Deleted successfully");
        }

        em.close();
        emf.close();
	}
}
