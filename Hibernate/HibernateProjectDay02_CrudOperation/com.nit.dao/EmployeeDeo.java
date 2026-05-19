package com.nit.dao;

import com.nit.dto.Employee;
import jakarta.persistence.*;

public class EmployeeDao {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        // 1. INSERT
        Employee e = new Employee();
        e.setName("mds");
        e.setDept("Sales");
        e.setSalary(8000);
        e.setMob(78945613);

        et.begin();
        em.persist(e);
        et.commit();
        System.out.println("Inserted successfully");

        // 2. FETCH
        Employee emp = em.find(Employee.class, 1);
        if (emp != null) {
            System.out.println(emp.getId());
            System.out.println(emp.getName());
            System.out.println(emp.getMob());
            System.out.println(emp.getSalary());
            System.out.println(emp.getDept());
        } else {
            System.out.println("Employee not found");
        }

        // 3. UPDATE
        Employee emp1 = em.find(Employee.class, 1);
        if (emp1 != null) {
            et.begin();
            emp1.setName("Mds");
            emp1.setMob(4567891234L);
            emp1.setSalary(897500);
            emp1.setDept("EEE");
            et.commit();   // Dirty checking (no merge needed)
            System.out.println("Updated successfully");
        }

        // 4. DELETE
        Employee emp2 = em.find(Employee.class, 1);
        if (emp2 != null) {
            et.begin();
            em.remove(emp2);
            et.commit();
            System.out.println("Deleted successfully");
        }

        em.close();
        emf.close();
    }
}
