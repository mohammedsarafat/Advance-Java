package com.nit.dao;

import java.util.List;
import com.nit.dto.Student2;
import jakarta.persistence.*;

public class FetchWholeTable {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("sarafat");
        EntityManager em = emf.createEntityManager();

        // FETCH ALL DATA
        List<Student2> list = em.createQuery(
                "SELECT s FROM Student2 s", Student2.class
        ).getResultList();

        for (Student2 stu : list) {
            System.out.println(stu);
        }

        em.close();
        emf.close();
    }
}
